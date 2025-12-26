package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: IsArraySorted
 */

/**
 * Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
 *
 * Note: Two consecutive equal values are considered to be sorted.
 *
 * Input: N = 5, array[] = {5,4,6,7,8}
 * Output: False.
 * Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.
 *
 * Here element 5 is not smaller than or equal to its future elements.
 */
public class IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};
        System.out.println(isArraySorted(arr));
    }

    private static boolean isArraySorted(int[] arr) {
        for (int i=0 ; i<arr.length - 1 ; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
