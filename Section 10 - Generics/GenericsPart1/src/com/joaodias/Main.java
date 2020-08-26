package com.joaodias;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> footballTeam = new Team<>("Football Team");
        footballTeam.addPlayer(joe);
        //footballTeam.addPlayer(pat);
        //footballTeam.addPlayer(beckham);

        System.out.println(footballTeam.getNumPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
        baseballTeam.addPlayer(pat);

        //Team<String> brokenTeam = new Team<>("Broken Team");
        //brokenTeam.addPlayer("No player");

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");
        soccerTeam.addPlayer(beckham);
    }

}
