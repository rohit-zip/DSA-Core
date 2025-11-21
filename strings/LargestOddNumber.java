package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LargestOddNumber
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.
 * The number returned should not have leading zero's. But the given input string may have leading zero.
 *
 * Example 1
 * Input: s = "5347"
 * Output: "5347"
 * Explanation: The odd numbers formed by the given string are → 5, 3, 53, 347, 5347. The largest odd number without leading zeroes is 5347.
 *
 * Example 2
 * Input: s = "0214638"
 * Output: "21463"
 * Explanation: The odd numbers formed by the string are → 1, 3, 21, 63, 463, 1463, 21463. We can't use numbers starting with 0, so the largest valid odd number is 21463.
 */
public class LargestOddNumber {

    public static void main(String[] args) {
        String str = "52";
        String data = largestOddNumber(str);
        System.err.println(data);
    }

    private static String largestOddNumber(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1 ; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }

        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i)) % 2 == 1) {
                max = Math.max(max, Integer.parseInt(list.get(i)));
            }
        }
        return max != 0 ? max + "" : "";
    }
}
