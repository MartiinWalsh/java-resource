package com.mcodes;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("West End", 10, 12);
        theatre.getSeats();

        if(theatre.reserveSeat("E10")){
            System.out.println("Payment needed");
        } else {
            System.out.println("Seat is already reserved");
        }

        if(theatre.reserveSeat("E10")){
            System.out.println("Payment needed");
        } else {
            System.out.println("Seat is already reserved");
        }
    }
}
