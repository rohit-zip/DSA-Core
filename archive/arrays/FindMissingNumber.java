package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: FindMissingNumber
 */

/**
 * Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array.
 *
 * Example 1:
 * Input Format: N = 5, array[] = {1,2,4,5}
 * Result: 3
 * Explanation: In the given array, number 3 is missing. So, 3 is the answer.
 *
 * Example 2:
 * Input Format: N = 3, array[] = {1,3}
 * Result: 2
 * Explanation: In the given array, number 2 is missing. So, 2 is the answer.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        optimal2(arr);
    }

    private static void bruteForce(int[] arr) {
        int n = arr.length + 1;

        for (int i = 1; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i);
                return;
            }
        }
    }

    private static void better(int[] arr) {
        int n = arr.length + 1;
        int hash[] = new int[n + 1];
        for (int i=0 ; i< arr.length ; i++) {
            hash[arr[i]]++;
        }

        for (int i=1 ; i<hash.length ; i++) {
            if (hash[i] == 0) {
                System.out.println(i);
                return;
            }
        }
    }

    private static void optimal1(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n+1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        System.err.println(totalSum - arrSum);
    }

    /**
     * Using XOR
     * a^a = 0
     * 0^2 = 2
     * @param arr
     */
    private static void optimal2(int[] arr) {
        int n = arr.length + 1;
        int xor1 = 0;
        for (int i=1 ; i<=n ; i++) {
            xor1 ^= i;
        }
        int xor2 = 0;
        for (int num : arr) {
            xor2 ^= num;
        }
        System.err.println(xor1 ^ xor2);
    }
}
