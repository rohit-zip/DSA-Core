package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SingleNumber
 */

import java.util.HashMap;
import java.util.Map;

/*
  Problem Statement:
  Given a non-empty array of integers, every element appears twice except for one.
  Find that single one.

  You must implement a solution with linear runtime complexity and use only constant extra space.

  Examples:
  Input: [2,2,1]
  Output: 1

  Input: [4,1,2,1,2]
  Output: 4

  Input: [1]
  Output: 1
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int data = optimal(arr);
        System.out.println(data);
    }

    /*
      Time Complexity: O(n^2) - For each element, we traverse the entire array to count occurrences.
      Space Complexity: O(1) - No extra space used except for variables.
     */
    private static int bruteForce(int[] arr) {
        // Iterate through each element in the array
        for (int i = 0 ; i < arr.length ; i++) {
            int num = arr[i]; // Current number to check
            int count = 0;    // Counter for occurrences
            // Count how many times num appears in the array
            for (int j = 0 ; j < arr.length ; j++) {
                if (num == arr[j]) {
                    count++; // Increment count if match found
                }
            }
            // If count is 1, this is the single number
            if (count == 1) {
                return num;
            }
        }
        // If no single number found, return -1
        return -1;
    }

    /*
      Time Complexity: O(n) - Each element is processed twice (once for put, once for entrySet).
      Space Complexity: O(n) - A HashMap is used to store counts for each unique element.
     */
    private static int better(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); // Map to store element counts
        // Count occurrences of each element
        for (int i = 0 ; i < arr.length ; i++) {
            // Increment count for arr[i], or set to 1 if not present
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // Iterate through map entries to find the element with count 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey(); // Return the single number
            }
        }
        // If no single number found, return -1
        return -1;
    }

    /*
      Time Complexity: O(n) - Each element is visited once.
      Space Complexity: O(1) - Only a single integer variable is used.
      Explanation: XOR-ing all elements cancels out numbers appearing twice, leaving the single number.
     */
    private static int optimal(int[] arr) {
        int xor = 0; // Initialize result variable
        // XOR all elements in the array
        for (int i = 0 ; i < arr.length ; i++) {
            xor ^= arr[i]; // XOR current element with result
        }
        // The result is the single number
        return xor;
    }
}
