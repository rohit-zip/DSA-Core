package sorting;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SelectionSort
 */

/**
 * URL: https://takeuforward.org/sorting/selection-sort-algorithm/
 * Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.
 *
 * Examples:
 *
 * Example 1:
 * Input: N = 6, array[] = {13,46,24,52,20,9}
 * Output: 9,13,20,24,46,52
 * Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52
 *
 * Example 2:
 * Input: N=5, array[] = {5,4,3,2,1}
 * Output: 1,2,3,4,5
 * Explanation: After sorting the array is: 1, 2, 3, 4, 5
 *
 * Approach: Find the minimum element in the unsorted array and swap it with the element at the beginning.
 *          Repeat the process for the remaining unsorted array.
 *          Time Complexity: O(N^2)
 *          Space Complexity: O(1)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

//    private static void selectionSort(int[] arr) {
//        int n = arr.length;
//
//        for (int i =0 ; i< n-1 ; i++) {
//            int min = i;
//            for (int j=i+1 ; j<=n-1 ; j++) {
//                if (arr[j]<arr[min]) {
//                    min = j;
//                }
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }
//    }

    private static void selectionSort(int[] arr) {
        for (int i = 0 ; i < arr.length - 1 ; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
