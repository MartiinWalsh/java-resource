package com.mcodes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Dublin");
        addInOrder(placesToVisit, "Kildare");
        addInOrder(placesToVisit, "Galway");
        addInOrder(placesToVisit, "Kerry");
        addInOrder(placesToVisit, "Cork");
        addInOrder(placesToVisit, "Mayo");

        // Displays error as duplicate
        addInOrder(placesToVisit, "Mayo");
        printList(placesToVisit);

        visit(placesToVisit);

//        placesToVisit.add(1, "Carlow");
//        placesToVisit.remove(4);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            //.next will show current then move to next item in the list
            System.out.println("Currently visiting: " + i.next());
        }
        System.out.println("---------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCounty) {
        // This does not automatically point to first entry
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            // if == 0 it means they match
            int comparison = stringListIterator.next().compareTo(newCounty);

            if (comparison == 0) {
                System.out.println(newCounty + " is already included.");
                return false;
                // new item should appear before this one
                // e.g. if looking at Kildare but Dublin was added, it is before Kildare alphabetically and will return > 0
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCounty);
                return true;
            } else if (comparison < 0) {
                // Move to next county
            }
        }

        // Not found during loop, therefore add to end of list
        stringListIterator.add(newCounty);
        return true;
    }

    // Doubly linked list //
    private static void visit(LinkedList counties) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean movingForward = true;
        ListIterator<String> listIterator = counties.listIterator();

        if (counties.isEmpty()) {
            System.out.println("No counties.");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Quit");
                    quit = true;
                    break;

                case 1:
                    //Users has previously chose to move back
                    if(!movingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        movingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Visitng " + listIterator.next() + "\n");
                    } else {
                        System.out.println("End of list");
                        movingForward = false;
                    }
                    break;

                case 2:
                    if(movingForward){
                        if(listIterator.hasNext()){
                            listIterator.previous();
                        }
                        movingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Visitng " + listIterator.previous() + "\n");
                    } else {
                        System.out.println("Start of list");
                        movingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }
        }
    }

    public static void printMenu() {
        System.out.println("Options:\n");
        System.out.println("0 - quit\n" +
                "1 - Next county\n" +
                "2 - Previous county\n" +
                "3 = Print options");
    }
}
