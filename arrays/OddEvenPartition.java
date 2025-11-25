package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: OddEvenPartition
 */

import java.util.Arrays;

public class OddEvenPartition {

    public static void main(String[] args) {
        int[] arr = {12,17,70,15,22,65,21,90};
        oddEvenPartition(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void oddEvenPartition(int[] arr) {
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
}
