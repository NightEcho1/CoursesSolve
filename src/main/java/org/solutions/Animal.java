package org.solutions;

public abstract class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void sleep() {
        System.out.println(this.animalName + " sleeps");
    }

    public void eat() {
        System.out.println(this.animalName + " eats");
    }
}
