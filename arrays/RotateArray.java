package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int a, int b) {
        if (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            reverse(arr, a + 1, b - 1);
        }
    }
}
