package hashing;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: FrequencyMap
 */

import java.util.HashMap;
import java.util.Scanner;

/**
 * URL: https://takeuforward.org/hashing/hashing-maps-time-complexity-collisions-division-rule-of-hashing-strivers-a2z-dsa-course/
 */
public class FrequencyMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.err.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i=0 ; i<n ; i++) {
            int freq = freqMap.getOrDefault(arr[i], 0);
            freq++;
            freqMap.put(arr[i], freq);
        }

        System.err.println("Enter the element to find frequency: ");
        int x = sc.nextInt();
        System.out.println("Frequency of " + x + " is: " + freqMap.get(x));
    }
}
