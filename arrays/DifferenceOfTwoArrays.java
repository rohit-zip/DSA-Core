package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: DifferenceOfTwoArrays
 */

import java.util.Arrays;

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
