package com.mcodes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer jack = new FootballPlayer("Jack");
        BasketballPlayer mark = new BasketballPlayer("Mark");
        RugbyPlayer brian = new RugbyPlayer("Brian");

        Team<FootballPlayer> footballTeam = new Team<>("Football Team");
        footballTeam.addPlayer(jack);

        System.out.println(footballTeam.numPlayers());

        Team<BasketballPlayer> basketballTeam = new Team<>("Basketball Team");
        basketballTeam.addPlayer(mark);

        Team<RugbyPlayer> rugbyTeam = new Team<>("Rugby Team");
        rugbyTeam.addPlayer(brian);

        System.out.println();

        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> manUnited = new Team<>("Manchester United");
        Team<FootballPlayer> manCity = new Team<>("Manchester City");

        chelsea.matchResult(manUnited, 1, 0);
        chelsea.matchResult(manCity, 1, 2);

        System.out.println("\n\nRankings");
        System.out.println(chelsea.getName() + ": " + chelsea.ranking());
        System.out.println(manUnited.getName() + ": " + manUnited.ranking());
        System.out.println(manCity.getName() + ": " + manCity.ranking());

        System.out.println(chelsea.compareTo(manCity));
        System.out.println(chelsea.compareTo(manUnited));
        System.out.println(manCity.compareTo(chelsea));


    }


}
