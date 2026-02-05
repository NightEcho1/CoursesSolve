package org.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<String> inputs = new ArrayList<>();

       System.out.println("Input numbers, type \"end\" to stop.");
       while (true) {
           String row = scanner.nextLine();
           if (row.equals("end")) {
               System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
               String answer = scanner.nextLine();
               if (answer.equals("p")) {
                   double positiveAverage = inputs.stream()
                           .mapToInt(s -> Integer.valueOf(s))
                           .filter(number -> number >= 0)
                           .average()
                           .getAsDouble();
                   System.out.println("Average of the positive numbers: " + positiveAverage);
                   break;
               } else if (answer.equals("n")) {
                   double negativeAverage = inputs.stream()
                           .mapToInt(s -> Integer.valueOf(s))
                           .filter(number -> number < 0)
                           .average()
                           .getAsDouble();
                   System.out.println("Average of the negative numbers: " + negativeAverage);
                   break;
               }
           }

           inputs.add(row);
       }
    }
}


    /*public static int linearSearch(int[] array, int indexToSearch) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == indexToSearch) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] array, int indexToSearch) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == indexToSearch) {
                return middle;
            }

            if (array[middle] < indexToSearch) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1; // элемент не найден
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

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }*/
