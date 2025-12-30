package arrays;

import java.util.Arrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,1,0,9,5};
        int[] arr2 = {1,1,1,1,1,1};
        int[] sum = sum(arr1, arr2);
        System.out.println(Arrays.toString(sum));
    }

    private static int[] sum(int[] arr1, int[] arr2) {
        int[] arr = new int[Math.max(arr1.length, arr2.length) + 1];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int c = 0;
        int k = arr.length - 1;
        while (k >= 0) {
            int sum = c;
            if (i >= 0) {
                sum+= arr1[i];
            }
            if (j >= 0) {
                sum+= arr2[j];
            }
            arr[k] = sum % 10;
            c = sum / 10;
            i--;
            j--;
            k--;
        }

        if (c != 0) {
            arr[k] = c;
        }

        return arr;
    }
}
