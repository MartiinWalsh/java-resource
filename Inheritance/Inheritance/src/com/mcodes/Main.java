package com.mcodes;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Terrier", 5, 12, 2, 4, 1, 20, "Silky");
        //Using method from animal class
        dog.eat();
        dog.walk();
        dog.run();
    }


}
