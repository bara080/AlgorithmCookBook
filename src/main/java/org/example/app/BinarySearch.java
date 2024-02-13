package org.example.app;

public class BinarySearch{

    //  create a class for binary search

        public static int binarySearch ( int[] array, int target){
            //  variable left
            int left = 0;

            //  variable right
            int right = array.length - 1;

            while (left <= right) {

                // find mid-point
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid; // Target found
                } else if (array[mid] < target) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }

            return -1; // Target not found
        }

        public static void main (String[]args) {
            int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int target = 7;

            int result = binarySearch(sortedArray, target);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }
