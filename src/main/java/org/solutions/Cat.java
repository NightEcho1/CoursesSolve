package org.solutions;

public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        super("Cat");
    }

    public Cat(String catName) {
        super(catName);
    }

    public void purr() {
        System.out.println(super.getAnimalName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
