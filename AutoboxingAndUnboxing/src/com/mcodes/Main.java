package com.mcodes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        // Previous form of boxing and unboxing //
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(Integer.valueOf(i)));
        }
        /////////////////

        //Autoboxing and Unboxing //

        Integer intVal = 56; // Integer.valueOf(56);
        int myInt = intVal; // myInt.intValue();

        ArrayList<Double> doubleValues = new ArrayList<>();

        for(double db = 0.0; db <= 10.0; db += 0.5){
            doubleValues.add(db);
        }

        for (int i = 0; i < doubleValues.size(); i++) {
            double value = doubleValues.get(i);
            System.out.println(i + " ---> " + value);
        }


    }
}
