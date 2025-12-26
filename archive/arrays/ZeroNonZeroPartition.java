package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ZeroNonZeroPartition
 */

import java.util.Arrays;

public class ZeroNonZeroPartition {

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 2, 8};
        doPartition(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void doPartition(int[] arr) {
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }
}
