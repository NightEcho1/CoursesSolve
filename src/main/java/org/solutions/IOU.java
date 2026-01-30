package org.solutions;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debtors;

    public IOU() {
        this.debtors = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtors.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debtors.get(toWhom);
    }
}
