package practice;

import java.util.ArrayList;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: AllDivisors
 */

import java.util.List;

public class AllDivisors1 {

    public static void main(String[] args) {
      List<Integer> list = optimized(36);
      System.err.println(list);
    }

    private static List<Integer> allDivisors(int n) {
      List<Integer> list = new ArrayList<>();
      for (int i = 1 ; i <= n ; i++) {
        if (n % i == 0) {
          list.add(i);
        }
      }
      return list;
    }

    private static List<Integer> optimized(int n) {
      List<Integer> list = new ArrayList<>();
      for (int i=1 ; i <= Math.sqrt(n) ; i++) {
        if (n % i == 0) {
          list.add(i);
          if (n/i != i) {
            list.add(n/i);
          }
        }
      }
      return list;
    }
}
