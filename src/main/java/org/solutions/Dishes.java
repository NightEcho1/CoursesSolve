package org.solutions;

import java.util.ArrayList;

public class Dishes {
    private String name;
    private int timeToCook;
    private ArrayList<String> ingridents;

    public Dishes(String name, int timeToCook, ArrayList<String> ingridents) {
        this.name = name;
        this.timeToCook = timeToCook;
        this.ingridents = ingridents;
    }

    public String getName() {
        return name;
    }

    public int getTimeToCook() {
        return timeToCook;
    }

    public ArrayList<String> getIngridents() {
        return ingridents;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.timeToCook;
    }
}
