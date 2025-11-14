package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: CountMaximumConsecutive
 */

/**
 * Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
 *
 * Example 1:
 * Input: prices = {1, 1, 0, 1, 1, 1}
 * Output: 3
 * Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.
 *
 * Example 2:
 * Input: prices = {1, 0, 1, 1, 0, 1}
 * Output: 2
 * Explanation: There are two consecutive 1's in the array.
 */
public class CountMaximumConsecutive {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0};
        int count = bruteForce(arr);
        System.err.println(count);
    }

    private static int bruteForce(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i=0 ; i<arr.length ; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return maxCount;
    }
}
