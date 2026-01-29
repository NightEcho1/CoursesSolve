package org.solutions;

import java.util.ArrayList;

public class BirdDatabase {
    public ArrayList<Bird> birdArrayList;

    public BirdDatabase() {
        this.birdArrayList = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.birdArrayList.add(bird);
    }

    public void addObeservation(String name) {
        for (Bird bird : birdArrayList) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }

        System.out.println("Not a Bird!");
    }

    public void print() {
        for (Bird bird : birdArrayList) {
            System.out.println(bird);
        }
    }

    public void printOne(String name) {
        {
            for (Bird bird : birdArrayList) {
                if (bird.getName().equals(name)) {
                    System.out.println(bird);
                }
            }
        }
    }
}