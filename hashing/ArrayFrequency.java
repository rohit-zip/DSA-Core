package hashing;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ArrayCounter
 */

import java.util.Scanner;

/**
 * https://takeuforward.org/hashing/hashing-maps-time-complexity-collisions-division-rule-of-hashing-strivers-a2z-dsa-course/
 */
public class ArrayFrequency {

    /**
     * Count frequency of elements in an array
     * Time Complexity: O(N)
     * Space Complexity: O(1) as size of hash array is constant
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[16];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.err.println("Enter the element to find frequency: ");
        int x = sc.nextInt();
        System.out.println("Frequency of " + x + " is: " + hash[x]);
    }
}
