package org.solutions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeStatistics gradeStatistics = new GradeStatistics();
        Scanner scanner = new Scanner(System.in);
        GradeStatisticsUI gradeStatisticsUI = new GradeStatisticsUI(gradeStatistics, scanner);

        gradeStatisticsUI.start();
    }

    public static int linearSearch(int[] array, int indexToSearch) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == indexToSearch) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySeach(int[] array, int indexToSeach) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == indexToSeach) {
                return middle;
            }

            if (array[middle] < indexToSeach) {
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
    }
}