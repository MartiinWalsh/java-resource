package com.mcodes;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Premier League");

        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> manUnited = new Team<>("Manchester United");
        Team<FootballPlayer> manCity = new Team<>("Manchester City");
        Team<FootballPlayer> liverpool = new Team<>("Liverpool ");

        footballLeague.add(chelsea);
        footballLeague.add(manUnited);
        footballLeague.add(manCity);
        footballLeague.add(liverpool);

        chelsea.matchResult(manUnited, 1,0);
        chelsea.matchResult(manCity, 1, 2);
        manCity.matchResult(liverpool, 1, 2);

        System.out.println("\n\nLeague Table");
        footballLeague.showTable();
    }
}
