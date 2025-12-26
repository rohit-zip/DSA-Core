package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LongestSubarrayWithSum
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSum {

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int data = betterBruteForce( arr, 10);
        System.out.println(data);
    }

    private static int bruteForce(int[] arr, int data) {
        int max = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i ; j < arr.length ; j++) {
                int sum = 0;
                for (int k = i ; k <= j ; k++) {
                    sum += arr[k];
                }

                if (sum == data) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }

    private static int betterBruteForce(int[] arr, int data) {
        int max = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            int sum = 0;
            for (int j = i ; j < arr.length ; j++) {
                sum += arr[j];

                if (sum == data) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}
