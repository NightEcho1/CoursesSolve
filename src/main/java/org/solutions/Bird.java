package org.solutions;

public class Bird {
    private final String name;
    private final String latinName;
    private int obeservation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.obeservation = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObeservation() {
        return this.obeservation;
    }


    public void addObservation() {
        this.obeservation++;
    }

    @Override
    public String toString() {
        return this.getName() + "(" + this.getLatinName()  + "): " + this.getObeservation() + " observations.";
    }
}
