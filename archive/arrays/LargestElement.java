package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LargestElement
 */

import java.util.Arrays;

/**
 * URL: https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
 * Problem Statement: Given an array, we have to find the largest element in the array.
 *
 * Example 1:
 * Input: arr[] = {2,5,1,3,0};
 * Output: 5
 * Explanation: 5 is the largest element in the array.
 *
 * Example2:
 * Input: arr[] = {8,10,5,7,9};
 * Output: 10
 * Explanation: 10 is the largest element in the array.
 */
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println("The largest element in the array is: " + largestElement(arr));
    }

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * @param arr
     * @return
     */
    private static int largestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            //if (i > largest) largest = i;
            largest = Math.max(largest, i);
        }
        return largest;
    }

    /**
     * Using Stream API
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     * @param arr
     * @return
     */
    private static int usingStream(int[] arr) {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }
}
