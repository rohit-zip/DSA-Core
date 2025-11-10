package sorting;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: BubbleSort
 */

/**
 * URL: https://takeuforward.org/data-structure/bubble-sort-algorithm/
 * Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.
 *
 * Examples:
 *
 * Example 1:
 * Input: N = 6, array[] = {13,46,24,52,20,9}
 * Output: 9,13,20,24,46,52
 * Explanation: After sorting we get 9,13,20,24,46,52
 *
 *
 * Input: N = 5, array[] = {5,4,3,2,1}
 * Output: 1,2,3,4,5
 * Explanation: After sorting we get 1,2,3,4,5
 *
 * Approach: Repeatedly swap the adjacent elements if they are in wrong order.
 *          Time Complexity: O(N^2)
 *          Space Complexity: O(1)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        optimized(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i=n-1 ; i>0 ; i--) {
            for (int j=0 ; j<i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void optimized(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i=n-1 ; i>0 ; i--) {
            swapped = false;
            for (int j=0 ; j<i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
