package com.mradilla.algorithms;

public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int item) {
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = sortedArray[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(array, 3)); // 1
        System.out.println(binarySearch(array, -1)); // -1
        System.out.println(binarySearch(array, 0)); // -1
        System.out.println(binarySearch(array, 9)); // 4
        System.out.println(binarySearch(array, 10)); // -1

    }
}