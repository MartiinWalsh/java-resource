package com.mcodes;

public class Main {
    public static void main(String[] args) {
//  --- Without Encapsulation ---
//        Player player = new Player();
//        player.name = "Jack";
//        player.health = 20;
//        player.weapon = "Spear";
//
//        int damage = 10;
//        player.reduceHealth(damage);
//        System.out.println("Player health: " + player.healthReamining());


        NewPlayer player = new NewPlayer("Jack", 50, "Spear");
        System.out.println("Initial health: " + player.getHealth());
        player.reduceHealth(20);
        System.out.println("Initial health: " + player.getHealth());

    }
}
