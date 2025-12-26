package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: RotateArray
 */

/*
 * Problem Statement:
 * Given an integer array `arr` and an integer `k`, rotate the array to the right by `k` steps in-place.
 * After rotation, each element in the array should be shifted to the right by `k` positions, and elements that fall off the end should wrap around to the beginning.
 *
 * Examples:
 * Input: arr = [1, 2, 3, 4, 5], k = 2
 * Output: [4, 5, 1, 2, 3]
 *
 * Input: arr = [7, 8, 9], k = 1
 * Output: [9, 7, 8]
 */
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        System.err.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {
        reverse(arr, 0, k);
        reverse(arr, k + 1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
