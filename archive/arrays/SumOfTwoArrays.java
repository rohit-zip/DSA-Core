package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SumOfTwoArrays
 */

import java.util.Arrays;

/*
  Problem Statement:
  Given two arrays representing two non-negative integers, where each element in the array is a single digit and the most significant digit comes first, write a function to return their sum as an array of digits.

  The two input arrays may have different lengths. The output should not contain any leading zeros unless the sum is zero.

  Examples:
  Example 1:
    Input: arr1 = [3,1,0,7,5], arr2 = [1,1,1,1,1,1]
    Output: [1,1,4,2,8,6]
    Explanation: 31075 + 111111 = 142186

  Example 2:
    Input: arr1 = [9,9,9], arr2 = [1]
    Output: [1,0,0,0]
    Explanation: 999 + 1 = 1000

  Example 3:
    Input: arr1 = [0], arr2 = [0]
    Output: [0]
    Explanation: 0 + 0 = 0
*/
public class SumOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {3,1,0,7,5};
        int[] arr2 = {1,1,1,1,1,1};
        int[] result = sumOfTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] sum = new int[maxLength];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int k = sum.length - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = i >= 0 ? arr1[i] : 0;
            int d2 = j >= 0 ? arr2[j] : 0;
            int a = d1 + d2 + carry;
            sum[k] = a % 10;
            carry = a / 10;
            i--;
            j--;
            k--;
        }

        return sum;
    }
}
