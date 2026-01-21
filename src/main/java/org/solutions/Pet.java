package org.solutions;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getPetName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
