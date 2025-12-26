package archive.sorting;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: MergeSort
 */

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {7,4,1,3,6,8,2,5};
        int[] merge = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(merge));
    }

    private static int[] mergeSort(int[] arr, int l, int h) {
        if (l == h) {
            return new int[]{arr[l]};
        }
        int mid = (l + h) / 2;
        int[] larr = mergeSort(arr, l, mid);
        int[] rarr = mergeSort(arr, mid + 1, h);
        int[] merge = mergeTwoSortedArrays(larr, rarr);
        return merge;
    }

    private static int[] mergeTwoSortedArrays(int[] larr, int[] rarr) {
        int[] arr = new int[larr.length + rarr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < larr.length && j < rarr.length) {
            if (larr[i] < rarr[j]) {
                arr[k++] = larr[i++];
            } else {
                arr[k++] = rarr[j++];
            }
        }

        while (i < larr.length) {
            arr[k++] = larr[i++];
        }

        while (j < rarr.length) {
            arr[k++] = rarr[j++];
        }

        return arr;
    }
}
