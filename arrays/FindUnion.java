package arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: FindUnion
 */

import java.util.*;

/**
 * Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
 *
 * The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.
 *
 * Example 1:
 * Input:
 * n = 5,m = 5.
 * arr1[] = {1,2,3,4,5}
 * arr2[] = {2,3,4,4,5}
 * Output:
 *  {1,2,3,4,5}
 *
 * Explanation:
 * Common Elements in arr1 and arr2  are:  2,3,4,5
 * Distnict Elements in arr1 are : 1
 * Distnict Elemennts in arr2 are : No distinct elements.
 * Union of arr1 and arr2 is {1,2,3,4,5}
 *
 * Example 2:
 * Input:
 * n = 10,m = 7.
 * arr1[] = {1,2,3,4,5,6,7,8,9,10}
 * arr2[] = {2,3,4,4,5,11,12}
 * Output: {1,2,3,4,5,6,7,8,9,10,11,12}
 * Explanation:
 * Common Elements in arr1 and arr2  are:  2,3,4,5
 * Distnict Elements in arr1 are : 1,6,7,8,9,10
 * Distnict Elemennts in arr2 are : 11,12
 * Union of arr1 and arr2 is {1,2,3,4,5,6,7,8,9,10,11,12}
 */
public class FindUnion {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        List<Integer> union = optimal(arr1, arr2);
        System.err.println(union);
    }

    private static List<Integer> hashmap(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < arr1.length ; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0 ; i < arr2.length ; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }

        System.err.println(map);

        List<Integer> unionList = new ArrayList<>();
        for (int i : map.keySet()) {
            unionList.add(i);
        }

        return unionList;
    }

    private static List<Integer> set(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr1)
            set.add(i);

        for (int i : arr2)
            set.add(i);

        List<Integer> unionList = new ArrayList<>();
        for (int i : set)
            unionList.add(i);

        return unionList;
    }

    private static List<Integer> optimal(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
                i++;
            }
        }

        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
                j++;
            }
        }

        return union;
    }
}
