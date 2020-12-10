package com.mcodes;

public class Player {
    //  --- Without Encapsulation, see Main class ---
    public String name;
    public int health;
    public String weapon;

    public void reduceHealth(int damage){
        this.health -= damage;
        if(this.health <=0){
            System.out.println("Player lost a life.");
        }
    }

    public int healthReamining(){
        return this.health;
    }
}
