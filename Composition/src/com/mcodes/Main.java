package com.mcodes;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(15, 15, 5);
        Case theCase = new Case("1201", "Dell", "220", dimensions);

        //Don't need a variable for the Resolution class so creating an instance of it within the constructor
        Monitor theMonitor = new Monitor("22inch", "Asus", 22, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("JJ23", "ASUS", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();


    }
}
