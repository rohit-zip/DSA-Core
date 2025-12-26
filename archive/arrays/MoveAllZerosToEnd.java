package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: MoveAllZerosToEnd
 */

/**
 * Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
 *
 * Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
 * Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
 * Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 *
 *
 * Input : 1,2,0,1,0,4,0
 * Output: 1,2,1,4,0,0,0
 * Explanation : All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */
public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        optimal(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n) Additional space for new array
     * @param arr
     */
    private static void bruteForce(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                temp[index] = num;
                index++;
            }
        }

        for (int i=0 ; i< arr.length ; i++) {
            arr[i] = temp[i];
        }
    }

    /**
     * Two Pointer
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static void optimal(int[] arr) {
        // Pointer to the zero
        int j = -1;

        for (int i=0 ; i<arr.length ; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j+1 ; i<arr.length ; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
