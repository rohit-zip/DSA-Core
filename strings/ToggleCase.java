package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ToggleCase
 */

/*
  Problem Statement:
  ------------------
  Given a string consisting of uppercase and lowercase English letters, toggle the case of each character in the string.
  That is, convert every uppercase letter to lowercase and every lowercase letter to uppercase.

  Examples:
  ---------
  Input:  "pepCODinG"
  Output: "PEPcodINg"

  Input:  "AbC"
  Output: "aBc"

  Input:  "java"
  Output: "JAVA"

  Constraints:
  ------------
  - The input string contains only English letters (a-z, A-Z).
  - 1 <= length of string <= 10^5
 */
public class ToggleCase {

    public static void main(String[] args) {
        String str = "pepCODinG";
        String data = solve(str);
        System.out.println(data);
    }

    /*
      Time Complexity: O(n), where n is the length of the input string.
      - We iterate through each character of the string exactly once.

      Space Complexity: O(n)
      - We use a StringBuilder to store the result, which in the worst case will be the same length as the input string.
     */
    private static String solve(String str) {
        // Create a StringBuilder to build the toggled string efficiently
        StringBuilder sb = new StringBuilder();
        // Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Get the character at the current index
            char ch = str.charAt(i);
            // Check if the character is uppercase (between 'A' and 'Z')
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase by calculating the ASCII value
                int lc = 'a' + ch - 'A';
                // Append the lowercase character to the StringBuilder
                sb.append((char) lc);
            } else {
                // Convert lowercase to uppercase by calculating the ASCII value
                int uc = 'A' + ch - 'a';
                // Append the uppercase character to the StringBuilder
                sb.append((char) uc);
            }
        }
        // Return the toggled string
        return sb.toString();
    }
}
