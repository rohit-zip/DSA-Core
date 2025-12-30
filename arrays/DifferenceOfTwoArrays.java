package arrays;

import java.util.Arrays;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] a1 = {9,9,9,9,9};
        int[] a2 = {3,3,3,3,3,3};
        int[] arr = diff(a1, a2);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] diff(int[] a1, int[] a2) {
        int[] arr = new int[a2.length];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = arr.length - 1;
        int c = 0;

        while (k >= 0) {
            int d1 = 0;
            int d2 = 0;
            if (i >= 0) {
                d1 = a1[i];
            }

            if (j >= 0) {
                d2 = a2[j];
            }
            int diff;
            if (d2 > d1) {
                diff = d2 - d1 + c;
                c = 0;
            } else {
                diff = d2 + 10 - d1 + c;
                c = -1; 
            }
            arr[k] = diff;
            i--;
            j--;
            k--;
        }
        return arr;
    }
}
