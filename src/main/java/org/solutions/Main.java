package org.solutions;


import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
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
}