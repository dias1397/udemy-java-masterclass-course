package com.joaodias.section10.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private String name;
    private List<T> members = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public Boolean addLeagueMember(T team) {
        if (members.contains(team)) {
            return false;
        } else {
            members.add(team);
            System.out.println(team.getName() + " belongs now to " + this.name);
            return true;
        }
    }

    public void getClassification() {
        if (this.members.size() <= 0) {
            System.out.println("League is empty");
            return;
        }

        System.out.println(this.name + " classification");
        Collections.sort(this.members);
        for (T team : members) {
            System.out.println(team.getName() + "\t- " + team.getTotalPoints() + "pt");
        }
    }

}
