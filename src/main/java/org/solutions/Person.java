package org.solutions;

public class Person {
    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return getName() + " has a friend called " + pet.getPetName() + "(" + pet.getBreed() + ")";
    }
}
