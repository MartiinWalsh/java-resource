package com.mcodes;

public class NewPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public NewPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void reduceHealth(int damage){
        this.hitPoints -= damage;
        if(this.hitPoints <=0){
            System.out.println("Player lost a life.");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
