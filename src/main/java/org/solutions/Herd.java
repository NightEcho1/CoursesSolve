package org.solutions;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private ArrayList<Movable> movableArrayList;

    public Herd() {
        this.movableArrayList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.movableArrayList.add(movable);
    }

    @Override
    public String toString() {
        String newString = "";

        for (Movable movable : movableArrayList) {
            newString += movable.toString().trim() + "\n";
        }

        return newString;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movableArrayList) {
            movable.move(dx, dy);
        }
    }
}
