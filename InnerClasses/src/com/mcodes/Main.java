package com.mcodes;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btn = new Button("Print");

    public static void main(String[] args) {

//        ## Method Local inner classes (Main Class)

//        class ClickListener implements Button.OnClickListener {
////            public ClickListener() {
////                System.out.println("Attached to button");
////            }
////
////            @Override
////            public void onClick(String title) {
////                System.out.println(title + " was clicked");
////            }
////        }
////
////        btn.setOnClickListener(new ClickListener());

//      ## Anonymous inner classes (Main Class)

        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
        listen();


//        Gearbox example run code - Nested Inner Class

//        // Outer class
//        Gearbox ford = new Gearbox(6);
//
//        ford.operateClutch(true);
//        ford.changeGear(1);
//        ford.operateClutch(false);
//        System.out.println(ford.wheelSpeed(100));
    }

    // To simulate button click
    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btn.onClick();
            }
        }
    }
}
