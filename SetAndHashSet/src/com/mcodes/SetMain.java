package com.mcodes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "this is an example sentence";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();
        String[] aWords = {"one", "four", "two", "six", "seven", "eight"};
        setA.addAll(Arrays.asList(aWords));

        String[] bWords = {"two", "ten", "four", "eleven", "twelve", "thirteen"};
        setB.addAll(Arrays.asList(bWords));

        //Asymmetric difference
        System.out.println("=============");
        System.out.println("setA - setB");
        Set<String> diff1 = new HashSet<>(setA);
        diff1.removeAll(setB);
        printSet(diff1);

        System.out.println("setB - setA");
        Set<String> diff2 = new HashSet<>(setB);
        diff2.removeAll(setA);
        printSet(diff2);

        //Symmetric difference
        Set<String> unionTest = new HashSet<>(setA);
        unionTest.addAll(setB);
        Set<String> intersectionTest = new HashSet<>(setA);
        intersectionTest.retainAll(setB);

        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(setA.containsAll(setB)){
            System.out.println("setA is a subset of setB");
        }

        if(setA.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of setA");
        }

        if(setB.containsAll(intersectionTest)){
            System.out.println("intersection is a subset of setB");
        }



    }

        private static void printSet(Set<String> set){
            System.out.println("\t");
            for(String s : set){
                System.out.println(s + " ");
            }
            System.out.println();




    }
}
