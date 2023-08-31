package com.mradilla.algorithms;

public class BinarySearch {

    // The binary_search function takes a sorted array and an item.
    // If the item is in the array, the function returns its position
    // or -1 otherwise.
    public static int binarySearch(int[] sortedArray, int item) {

        // low and high keep track of which part of the list you’ll search in.
        int low = 0;
        int high = sortedArray.length - 1;

        //While you haven’t narrowed it down to one element...
        while (low <= high) {
            // ... check the middle element.
            int mid = (low + high) / 2;
            int guess = sortedArray[mid];
            if (guess == item) {
                // Found the item
                return mid;
            }
            if (guess > item) {
                // The guess was too high
                high = mid - 1;
            } else {
                // The guess was too low
                low = mid + 1;
            }
        }

        // The item doesn’t exist
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        // lists start at 0. The second slot has index 1.
        System.out.println(binarySearch(array, 3)); // 1

        // -1 indicates that the item wasn’t found.
        System.out.println(binarySearch(array, -1)); // -1

        System.out.println(binarySearch(array, 0)); // -1
        System.out.println(binarySearch(array, 9)); // 4
        System.out.println(binarySearch(array, 10)); // -1

    }
}