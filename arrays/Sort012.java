package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Sort012
 */

import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,0,1,2,2,1,0,1,2,0,2,1};
        doPartition(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void doPartition(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (i <= k) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
}
