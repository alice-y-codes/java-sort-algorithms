package org.example;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

//        var sorted = selectionSort(intArray);
//        for (int j : sorted) {
//            System.out.println(j);
//        }
    }

    public static int[] selectionSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i =1; i <=lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        return intArray;
    }

    public static int[] bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int j : intArray) {
            System.out.println(j);
        }

        return intArray;
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}