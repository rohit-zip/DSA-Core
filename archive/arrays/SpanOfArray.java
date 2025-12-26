package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SpanOfArray

Problem Statement:
Given an array of integers, find the span of the array. The span of an array is defined as the difference between the maximum and minimum value in the array.

Examples:
Example 1:
Input: arr = [15, 30, 40, 4, 11]
Output: 36
Explanation: Maximum = 40, Minimum = 4, Span = 40 - 4 = 36

Example 2:
Input: arr = [5, 5, 5, 5]
Output: 0
Explanation: Maximum = 5, Minimum = 5, Span = 5 - 5 = 0

Example 3:
Input: arr = [-10, 0, 10, 20]
Output: 30
Explanation: Maximum = 20, Minimum = -10, Span = 20 - (-10) = 30
 */

public class SpanOfArray {

    public static void main(String[] args) {
        int[] arr = {15, 30, 40, 4, 11};
        int span = spanOfArray(arr);
        System.err.println(span);
    }

    private static int spanOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        return max - min;
    }
}
