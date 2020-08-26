package com.diasjoao;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0;
    int won= 0;
    int lost = 0;
    int tied = 0;

    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int getTotalPoints() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getTotalPoints() > team.getTotalPoints()) {
            return -1;
        } else if(this.getTotalPoints() < team.getTotalPoints()) {
            return 1;
        } else {
            return 0;
        }
    }

}
