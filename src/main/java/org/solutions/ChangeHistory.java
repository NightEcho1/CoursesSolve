package org.solutions;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> states;

    public ChangeHistory() {
        this.states = new ArrayList<>();
    }

    public void add(double status) {
        this.states.add(status);
    }

    public void clear() {
        this.states.clear();
    }

    @Override
    public String toString() {
        return states.toString();
    }

    public double maxValue() {
        double maxValue = 0.0;

        for (Double state : states) {
            if (state > maxValue) {
                maxValue = state;
            }
        }
        return maxValue;
    }

    public double minValue() {
        double minValue = states.get(0);

        for (Double state : states) {
            if (state < minValue) {
                minValue = state;
            }
        }
        return minValue;
    }

    public double average() {
        if (states.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;

        for (Double state : states) {
            sum += state;
        }

        return sum / this.states.size();
    }
}
