package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LeftRotateD
 */

/**
 * Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
 *
 * Examples:
 *
 * Example 1:
 * Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
 * Output: 6 7 1 2 3 4 5
 * Explanation: array is rotated to right by 2 position .
 *
 * Example 2:
 * Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left
 * Output: 9 10 11 3 7 8
 * Explanation: Array is rotated to right by 3 position.
 */
public class LeftRotateD {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        rotateLeft(arr, k);
        for (int num : arr) {
            System.err.print(num + " ");
        }
    }

    private static void rotateLeft(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
    }
}
