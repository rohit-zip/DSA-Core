package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: DifferenceOfTwoArrays
 */

import java.util.Arrays;

/*
  Problem Statement:
  Given two arrays representing two non-negative integers, where each element in the array is a single digit and the most significant digit comes first, write a function to return their difference as an array of digits (i.e., arr1 - arr2). Assume arr1 represents a number greater than or equal to arr2.

  The two input arrays may have different lengths. The output should not contain any leading zeros unless the difference is zero.

  Examples:
  Example 1:
    Input: arr1 = [3,3,3,3,3,3], arr2 = [9,9,9,9,9]
    Output: [3,2,3,3,3,4]
    Explanation: 333333 - 99999 = 323334

  Example 2:
    Input: arr1 = [1,0,0,0], arr2 = [1]
    Output: [9,9,9]
    Explanation: 1000 - 1 = 999

  Example 3:
    Input: arr1 = [5,0,0], arr2 = [5,0,0]
    Output: [0]
    Explanation: 500 - 500 = 0
*/

public class DifferenceOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {3,3,3,3,3,3};
        int[] arr2 = {9,9,9,9,9};
        int[] diff = new int[Math.max(arr1.length, arr2.length)];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int a = i >= 0 ? arr1[i] : 0;
            int b = j >= 0 ? arr2[j] : 0;
            int d = 0;
            if (a + carry >= b) {
                d = a + carry - b;
                carry = 0;
            } else {
                d = a + carry + 10 - b;
                carry = -1;
            }
            diff[k] = d;
            k--;
            i--;
            j--;
        }

        System.err.println(Arrays.toString(diff));
    }
}
