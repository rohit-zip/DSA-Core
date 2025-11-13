package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: RemoveDuplicatesSortedArray
 */

import com.sun.security.auth.UnixNumericUserPrincipal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
 *
 * If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Input: arr[]=[1,1,2,2,2,3,3]
 * Output: [1,2,3,_,_,_,_]
 * Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
 *
 *
 * Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
 * Output: [1,2,3,4,_,_,_,_,_,_,_]
 * Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
 */
public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int index = twoPointer(arr);
        for (int i = 0; i < index; i++) {
            System.err.print(arr[i] + " ");
        }
    }

    private static int[] doStream(int[] arr) {
        return Arrays
                .stream(arr)
                .distinct()
                .toArray();
    }

    private static int bruteForce(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int index = 0;
        for (int num : set) {
            arr[index++] = num;
        }
        return index;
    }

    private static int bruteForce2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int index = 0;
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                arr[index++] = num;
            }
        }
        return index;
    }

    private static int twoPointer(int[] arr) {
        int i = 0;
        for (int j=1 ; j<arr.length ; j++) {
            if (arr[i + 1] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i;
    }
}
