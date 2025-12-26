package archive.recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: KeypadCombination
 */

import java.util.ArrayList;
import java.util.List;

/*
  Problem Statement:
  ------------------
  Given a string containing digits from 0 to 9, return all possible letter combinations that the number could represent
  based on the mapping of digits to characters on a classic phone keypad.

  The mapping is as follows:
  0 -> .;
  1 -> abc
  2 -> def
  3 -> ghi
  4 -> jkl
  5 -> mno
  6 -> pqrs
  7 -> tu
  8 -> vwx
  9 -> yz

  Examples:
  ---------
  Input: "678"
  Output: [pvw, pvv, pvw, pwx, qvw, qvv, qvw, qwx, rvw, rvv, rvw, rwx, svw, svv, svw, swx, tvw, tvv, tvw, twx, uvw, uvv, uvw, uwx]

  Input: "23"
  Output: [gd, ge, gf, hd, he, hf, id, ie, if]
 */
public class KeypadCombination {

    static String[] codes = {
            ".;",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tu",
            "vwx",
            "yz"
    };

    public static void main(String[] args) {
        String str = "678";
        ArrayList<String> words = solve(str);
        System.out.println(words);
    }

    /*
      Time Complexity:
      ----------------
      O(k^n), where n is the length of the input string and k is the maximum number of characters mapped to a digit.
      For each digit, we branch out to all possible mapped characters, leading to exponential growth.

      Space Complexity:
      -----------------
      O(k^n), due to the storage of all possible combinations in the result list.

      Explanation:
      ------------
      - The recursion tree has a branching factor equal to the number of characters for each digit.
      - The total number of combinations is the product of the number of characters for each digit.
      - The space required is proportional to the number of combinations generated.
     */
    private static ArrayList<String> solve(String str) {
        // Base case: if the input string is empty, return a list with an empty string
        if (str.length() == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        // Get the first character (digit) of the string
        char ch = str.charAt(0);

        // Get the remaining substring after the first character
        String rem = str.substring(1);

        // Recursively solve for the remaining substring
        ArrayList<String> rres = solve(rem);

        // List to store the final combinations for the current call
        ArrayList<String> mres = new ArrayList<>();

        // Get the mapped characters for the current digit
        String codesForCh = codes[ch - '0'];

        // For each character mapped to the current digit
        for (int i = 0 ; i < codesForCh.length() ; i++) {
            char chCode = codesForCh.charAt(i);

            // For each combination returned from the recursive call
            for (String strs : rres) {
                // Prepend the current character to each combination and add to the result
                mres.add(chCode + strs);
            }
        }
        // Return the list of combinations for the current call
        return mres;
    }
}
