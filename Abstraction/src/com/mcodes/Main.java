package com.mcodes;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Terrier");
        dog.breathe();
        dog.eat();

        Swan swan = new Swan("Mute");
        swan.breathe();
        swan.eat();
        swan.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
