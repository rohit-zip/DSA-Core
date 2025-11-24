package sorting;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: InsertionSort
 */

import java.util.Arrays;

/*
  Problem Statement:
  ------------------
  Implement the Insertion Sort algorithm for sorting an array of integers in ascending order.
  The function should take an integer array as input and sort it in-place.

  Examples:
  ---------
  Input:  [2, 9, 5, 1, 3]
  Output: [1, 2, 3, 5, 9]

  Input:  [4, 3, 2, 1]
  Output: [1, 2, 3, 4]

  Input:  [1, 2, 3, 4]
  Output: [1, 2, 3, 4]
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2,9,5,1,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
      Time Complexity:
      ----------------
      Best Case: O(n) when the array is already sorted.
      Worst/Average Case: O(n^2) when the array is reverse sorted or random.
      Explanation: For each element, we may have to compare and shift all previous elements.

      Space Complexity:
      -----------------
      O(1) - The sorting is done in-place, so no extra space is used except for a temporary variable.
     */
    private static void insertionSort(int[] arr) {
        // Start from the second element (index 1) and iterate through the array
        for (int i = 1 ; i < arr.length ; i++) {
            // For each element, compare it with all previous elements
            for (int j = i - 1 ; j >= 0 ; j--) {
                // If the previous element is greater than the current, swap them
                if (arr[j] > arr[j+1]) {
                    // Store the previous element in a temporary variable
                    int temp = arr[j];
                    // Move the current element to the previous position
                    arr[j] = arr[j+1];
                    // Place the previous element in the current position
                    arr[j+1] = temp;
                } else {
                    // If the previous element is not greater, break out of the loop
                    // as the left part is already sorted
                    break;
                }
            }
        }
    }
}
