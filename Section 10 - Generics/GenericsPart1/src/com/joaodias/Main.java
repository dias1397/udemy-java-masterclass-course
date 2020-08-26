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

        Team<SoccerPlayer> soccerTeam2 = new Team<>("Soccer Team 2");
        Team<SoccerPlayer> soccerTeam3 = new Team<>("Soccer Team 3");

        soccerTeam.matchResult(soccerTeam2, 1, 0);
        soccerTeam.matchResult(soccerTeam3, 3,8);
        soccerTeam2.matchResult(soccerTeam3, 2, 2);

        //soccerTeam.matchResult(footballTeam, 1,1);

        System.out.println("Rankings");
        System.out.println(soccerTeam.getName() + ": " + soccerTeam.getRanking());
        System.out.println(soccerTeam2.getName() + ": " + soccerTeam2.getRanking());
        System.out.println(soccerTeam3.getName() + ": " + soccerTeam3.getRanking());

        System.out.println("Comparison");
        System.out.println(soccerTeam.compareTo(soccerTeam2));
        System.out.println(soccerTeam2.compareTo(soccerTeam3));
    }

}
