package hashing;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LowestHighestFrequencyElements
 */

import java.util.HashMap;
import java.util.Map;

/**
 * URL: https://takeuforward.org/arrays/find-the-highest-lowest-frequency-element/
 * Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
 *
 * Pre-requisite: Hashing Theory and  Counting frequencies of array elements
 *
 * Examples:
 *
 * Example 1:
 * Input: array[] = {10,5,10,15,10,5};
 * Output: 10 15
 * Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.
 *
 * Example 2:
 *
 * Input: array[] = {2,2,3,4,4,2};
 * Output: 2 3
 * Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.
 */
public class LowestHighestFrequencyElements {

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        frequency(arr);
    }

    private static void frequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++) {
            int freq = map.getOrDefault(arr[i], 0);
            freq++;
            map.put(arr[i], freq);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = 0, minElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minElement = element;
            }
        }

        System.err.println("Highest frequency element is: " + maxElement);
        System.err.println("Lowest frequency element is: " + minElement);
    }
}
