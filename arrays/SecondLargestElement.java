package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SecondLargestElement
 */

/**
 * Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
 *
 * Example 1:
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 2
 * 	Second Largest : 5
 * Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
 *
 * Example 2:
 * Input: [1]
 * Output: Second Smallest : -1
 * 	Second Largest : -1
 * Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 */
public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,5};
        getElements(arr);
    }

    private static void getElements(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i=0 ; i<arr.length ; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int i=0 ; i<arr.length ; i++) {
            if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }

            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.err.println("Second Smallest : " + secondMin);
        System.err.println("Second Largest : " + secondMax);
    }
}
