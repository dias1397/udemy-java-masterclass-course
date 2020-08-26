package com.diasjoao;

public class Main {

    public static void main(String[] args) {
        Team<SoccerPlayer> benfica = new Team<>("SL Benfica");
        Team<SoccerPlayer> sporting = new Team<>("SC Sporting");
        Team<SoccerPlayer> porto = new Team<>("FC Porto");
        Team<SoccerPlayer> braga = new Team<>("SC Braga");

        Team<BasketballPlayer> lakers = new Team<>("LA Lakers");
        Team<BasketballPlayer> clippers = new Team<>("LA Clippers");
        Team<BasketballPlayer> warriors = new Team<>("GS Warriors");
        Team<BasketballPlayer> heat = new Team<>("Miami Heat");

        Team<RugbyPlayer> belensense = new Team<>("Belenenses");
        Team<RugbyPlayer> direito = new Team<>("Direito");

        League<Team<SoccerPlayer>> ligaNos = new League<>("Liga NOS");
        ligaNos.addLeagueMember(benfica);
        ligaNos.addLeagueMember(sporting);
        ligaNos.addLeagueMember(porto);
        ligaNos.addLeagueMember(braga);
        //ligaNos.addLeagueMember(lakers);

        System.out.println("\n Jornada 1");
        benfica.matchResult(braga, 2,3);
        porto.matchResult(sporting, 0, 0);

        System.out.println("\n Jornada 2");
        braga.matchResult(sporting, 1, 1);
        porto.matchResult(benfica, 2, 0);

        System.out.println("\n Jornada 3");
        sporting.matchResult(benfica, 1,2);
        braga.matchResult(porto, 3, 0);

        ligaNos.getClassification();

    }
}
