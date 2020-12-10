package com.mcodes;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
