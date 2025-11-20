package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: AllIndices
 */

import java.util.Arrays;

public class AllIndices {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,7,6,4,12,7,6,8};
        System.err.println(Arrays.toString(allIndices(arr, 6, 0, 0)));
    }

    private static int[] allIndices(int[] arr, int data, int index, int fsf) {
        if (index == arr.length) {
            return new int[fsf];
        }
        if (arr[index] == data) {
            int[] iarr = allIndices(arr, data, index + 1, fsf + 1);
            iarr[fsf] = index;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, data, index + 1, fsf);
            return iarr;
        }
    }
}
