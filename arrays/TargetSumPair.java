package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: TargetSumPair
 */

import java.util.Arrays;

/*
  Problem Statement:
  ------------------
  Given an array of integers and a target sum, print all unique pairs of numbers from the array whose sum equals the target.
  Each pair should be printed in increasing order (smaller number first), and pairs should not repeat.

  Example 1:
    Input: arr = [7, 15, 3, 18, 6, 4, 19, 2, 12, 11, 9], target = 15
    Output:
      3,12
      4,11
      6,9

  Example 2:
    Input: arr = [1, 2, 3, 4, 5], target = 6
    Output:
      1,5
      2,4

  Constraints:
    - Array may contain positive integers only.
    - Each pair should be printed only once.
    - Order of pairs in output does not matter.
*/
public class TargetSumPair {

    public static void main(String[] args) {
        int[] arr = {7, 15, 3, 18, 6, 4, 19, 2, 12, 11, 9};
        solve(arr, 15);
    }

    /*
      Time Complexity: O(n log n)
        - mergeSort: O(n log n) for sorting the array
        - Two-pointer search: O(n)
        - Overall: O(n log n)
      Space Complexity: O(n)
        - mergeSort uses O(n) extra space for merging
    */
    private static void solve(int[] arr, int target) {
        // Sort the array using merge sort
        int[] sortedArray = mergeSort(arr, 0, arr.length - 1);

        // Initialize two pointers: left (l) at start, right (r) at end
        int l = 0;
        int r = sortedArray.length - 1;

        // Loop until the two pointers meet
        while (l < r) {
            // If sum is greater than target, move right pointer left
            if (sortedArray[l] + sortedArray[r] > target) {
                r--;
            }
            // If sum is less than target, move left pointer right
            else if (sortedArray[l] + sortedArray[r] < target) {
                l++;
            }
            // If sum equals target, print the pair and move both pointers
            else {
                System.out.println(sortedArray[l] + "," + sortedArray[r]);
                l++;
                r--;
            }
        }
    }

    /*
      Time Complexity: O(n log n)
        - Standard merge sort divides array and merges sorted halves.
      Space Complexity: O(n)
        - Uses extra space for temporary arrays during merge.
    */
    private static int[] mergeSort(int[] arr, int l, int r) {
        // Base case: if only one element, return it as a single-element array
        if (l == r) {
            return new int[]{arr[l]};
        }
        // Find the middle index
        int mid = (l + r) / 2;
        // Recursively sort left half
        int[] larr = mergeSort(arr, l, mid);
        // Recursively sort right half
        int[] rarr = mergeSort(arr, mid + 1, r);
        // Merge the two sorted halves
        int[] merge = mergeTwoSortedArrays(larr, rarr);

        return merge;
    }

    /*
      Time Complexity: O(n)
        - n is the total length of larr and rarr.
      Space Complexity: O(n)
        - Uses extra space for merged array.
    */
    private static int[] mergeTwoSortedArrays(int[] larr, int[] rarr) {
        // Create a new array to hold merged result
        int[] arr = new int[larr.length + rarr.length];
        int i = 0; // Pointer for larr
        int j = 0; // Pointer for rarr
        int k = 0; // Pointer for merged array

        // Merge elements from larr and rarr in sorted order
        while (i < larr.length && j < rarr.length) {
            if (larr[i] < rarr[j]) {
                arr[k++] = larr[i++];
            } else {
                arr[k++] = rarr[j++];
            }
        }

        // Copy any remaining elements from larr
        while (i < larr.length) {
            arr[k++] = larr[i++];
        }

        // Copy any remaining elements from rarr
        while (j < rarr.length) {
            arr[k++] = rarr[j++];
        }

        return arr;
    }
}
