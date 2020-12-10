package com.mcodes;

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<String> shoppingList = new ArrayList<>();

    public void addShoppingItem(String item) {
        shoppingList.add(item);
    }

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public void printShoppingList() {
        System.out.println("There are " + shoppingList.size() + " items in the list.");
        for (int i = 0; i < shoppingList.size(); i++) {
            {
                System.out.println((i + 1) + ". " + shoppingList.get(i));
            }
        }
    }

    public void modifyShoppingItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyShoppingItem(position, newItem);
        }
    }

    private void modifyShoppingItem(int position, String newItem) {
        shoppingList.set(position, newItem);
        System.out.println("Shopping item: " + (position + 1) + ", has been modified.");
    }

    public void removeShoppingItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeShoppingItem(position);
        }
    }

    private void removeShoppingItem(int position) {
        shoppingList.remove(position);
    }

    private int findItem(String searchItem) {
        return shoppingList.indexOf(searchItem);
    }

    public boolean checkList(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;

    }
}
