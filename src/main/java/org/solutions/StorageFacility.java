package org.solutions;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);

        //Второй вариант
        //this.unitsAndContents.putIfAbsent(unit, new ArrayList<>());
        //this.unitsAndContents.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (!(this.storage.containsKey(storageUnit))) {
            return;
        }

        this.storage.get(storageUnit).remove(item);

        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {

        return new ArrayList<>(this.storage.keySet());
    }
}
