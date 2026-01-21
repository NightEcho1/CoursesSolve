package org.solutions;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.stacks.isEmpty();
    }

    public void add(String value) {
        this.stacks.add(0, value);
    }

    public ArrayList<String> values() {
        return new ArrayList<>(this.stacks);
    }

    public String take() {
        String take = this.stacks.get(0);
        this.stacks.remove(this.stacks.get(0));
       return take;
    }
}
