package archive.binarySearch;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ImplementUpperBound
 */

/**
 * Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.
 * What is Upper Bound?
 *
 * The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than the given key i.e. x.
 *
 * The upper bound is the smallest index, ind, where arr[ind] > x.
 *
 * Example 1:
 * Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
 * Result: 3
 * Explanation: Index 3 is the smallest index such that arr[3] > x.
 *
 * Example 2:
 * Input Format: N = 6, arr[] = {3,5,8,9,15,19}, x = 9
 * Result: 4
 * Explanation: Index 4 is the smallest index such that arr[4] > x.
 */
public class ImplementUpperBound {

    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int idx = solve(arr, 9);
        System.err.println(idx);
    }

    private static int solve(int[] arr, int data) {
        int upperBound = -1;
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (data <= arr[mid]) {
                h = mid - 1;
                upperBound = mid;
            } else {
                l = mid + 1;
            }
        }
        return upperBound;

    }
}
