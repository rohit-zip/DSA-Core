package archive.recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: GetSubsequence
 */

import java.util.ArrayList;

/*
  Problem Statement:
  ------------------
  Given a string, generate all possible subsequences of the string.
  A subsequence is a sequence that can be derived from the string by deleting some or no elements without changing the order of the remaining elements.

  Examples:
  ---------
  Input: "abc"
  Output: ["", "c", "b", "bc", "a", "ac", "ab", "abc"]

  Input: "ab"
  Output: ["", "b", "a", "ab"]

  Input: ""
  Output: [""]
 */
public class GetSubsequence {

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> data = solve(str);
        System.out.println(data);
    }

    /*
      Time Complexity:
      ----------------
      O(2^n), where n is the length of the input string.
      Explanation: For each character, there are two choices: include it or exclude it, leading to 2^n possible subsequences.

      Space Complexity:
      -----------------
      O(2^n * n)
      Explanation: There are 2^n subsequences, and each subsequence can be up to length n.
     */
    private static ArrayList<String> solve(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);
        ArrayList<String> data = solve(rem);

        ArrayList<String> fData = new ArrayList<>();

        for (String strs : data) {
            fData.add("" + strs);
            fData.add(ch + strs);
        }
        return fData;
    }
}
