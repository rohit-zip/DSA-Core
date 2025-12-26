package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: InverseOfArray
 */

import java.util.Arrays;

/*
  Problem Statement:
  Given an array of length n containing all integers from 0 to n-1 (with no duplicates),
  compute its inverse. The inverse of an array is another array where the value at each
  index i is the index at which i occurs in the original array.

  Example 1:
    Input:  arr = {3, 4, 2, 1, 0}
    Output: inv = {4, 3, 2, 0, 1}

  Example 2:
    Input:  arr = {1, 0, 4, 2, 3}
    Output: inv = {1, 0, 3, 4, 2}
 */
public class InverseOfArray {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,0};
        int[] inv = inverse(arr);
        System.err.println(Arrays.toString(inv));
    }

    private static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++) {
            inv[arr[i]] = i;
        }
        return inv;
    }
}
