package org.solutions;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println("Smallest: " + smallest(numbers));
        System.out.println("Smallest index: " + indexOfSmallest(numbers));
        System.out.println(indexOfSmallestFrom(numbers, 0));
        System.out.println(indexOfSmallestFrom(numbers, 1));
        System.out.println(indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNumber = array[0];
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallestNumber = array[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}