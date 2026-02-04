package org.solutions;

public class Dog extends Animal implements NoiseCapable {

    public Dog() {
        super("Dog");
    }

    public Dog(String dogName) {
        super(dogName);
    }

    public void bark() {
        System.out.println(super.getAnimalName() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
