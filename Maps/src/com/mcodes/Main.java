package com.mcodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tempExit = new HashMap<>();

        locations.put(0, new Location(0, "You are at home", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

        Map<String, String> options = new HashMap<>();
        options.put("QUIT", "Q");
        options.put("NORTH", "N");
        options.put("SOUTH", "S");
        options.put("EAST", "E");
        options.put("WEST", "W");

        int location = 1;
        while (true) {
            System.out.println(locations.get(location).getDescription());
            if (location == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(location).getExits();
            System.out.print("The available exits are: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (options.containsKey(word)) {
                        direction = options.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                location = exits.get(direction);
            } else {
                System.out.println("Invalid direction");
            }
        }
    }
}
