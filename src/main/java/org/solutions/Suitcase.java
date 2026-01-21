package org.solutions;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int limit;
    private int counterOfItems = 0;
    public  Suitcase(int limit) {
        this.limit = limit;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {
        int sumOfWeight = 0;
        for (Item itemRunner : items) {
            sumOfWeight += itemRunner.getWeight();
        }

        if ((sumOfWeight + item.getWeight()) < limit) {
            items.add(item);
            counterOfItems++;
        }
    }

    @Override
    public String toString() {
        int allItemWeight = 0;
        for (Item item : items) {
            allItemWeight += item.getWeight();
        }

        if (counterOfItems == 0) {
            return "no items (" + allItemWeight + " kg)";
        } else if (items.size() == 1) {
            return counterOfItems + " item (" + allItemWeight + " kg)";
        }

        return counterOfItems + " items (" +  allItemWeight + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int counterOfTotalWeight = 0;
        for (Item item : items) {
            counterOfTotalWeight += item.getWeight();
        }
        return counterOfTotalWeight;
    }

    public Item heaviestItem() {
        int heviestItem = 0;
        Item heaviestItem = new Item(null, 0);
        for (Item item : items) {
            if (heviestItem < item.getWeight()) {
                heviestItem = item.getWeight();
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
