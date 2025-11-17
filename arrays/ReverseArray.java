package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ReverseArray
 */

import java.util.Arrays;

/*
  Problem Statement:
  Write a function to reverse an array of integers in place. Implement both an iterative and a recursive approach.

  Examples:
  Input: [1, 2, 3, 4, 5]
  Output: [5, 4, 3, 2, 1]

  Input: [10, 20, 30]
  Output: [30, 20, 10]

  Input: [7]
  Output: [7]
*/
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        recursive(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        int a = 0;
        int b = arr.length - 1;

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

    private static void recursive(int[] arr, int left, int right) {
        if (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            recursive(arr, left + 1, right);
        }
    }
}
