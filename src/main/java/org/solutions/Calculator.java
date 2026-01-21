package org.solutions;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public int addNumber(int number) {
        this.value += number;
        return number;
    }

    public void subtractNumber(int number) {
        this.value += number;
    }

    public void devideNumber(int number) {
        if (number == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            this.value /= number;
        }
    }

    public void multiplyByNumber(int number) {
        this.value *= number;
    }
}
