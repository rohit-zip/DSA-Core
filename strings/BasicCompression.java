package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: BasicCompression
 */

/*
  Problem Statement:
  Given a string, compress it by removing consecutive duplicate characters.
  Only the first occurrence of each group of consecutive duplicates should be kept.

  Examples:
    Input:  "aaabbcccddaeef"
    Output: "abcdaef"

    Input:  "aabbcc"
    Output: "abc"

    Input:  "abcd"
    Output: "abcd"

  Constraints:
    - The input string contains only lowercase English letters.
    - The string length is at least 1.

  Time Complexity: O(n), where n is the length of the input string.
  Space Complexity: O(n), for the output StringBuilder.
 */
public class BasicCompression {

    public static void main(String[] args) {
        // Example input string
        String str = "aaabbcccddaeef";
        // Call the solve method to compress the string
        String data = solve(str);
        // Print the compressed string
        System.out.println(data);
    }

    /*
      Time Complexity: O(n), where n is the length of the input string.
      - We iterate through the string once.

      Space Complexity: O(n)
      - StringBuilder may store up to n characters in the worst case (no duplicates).
     */
    private static String solve(String str) {
        // Create a StringBuilder to build the compressed string
        StringBuilder sb = new StringBuilder();
        // Append the first character, as it is always included
        sb.append(str.charAt(0));
        // Loop through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // If the current character is different from the previous one
            if (str.charAt(i) != str.charAt(i-1)) {
                // Append the current character to the result
                sb.append(str.charAt(i));
            }
            // If the current character is the same as the previous, do nothing (skip)
        }
        // Convert the StringBuilder to a String and return it
        return sb.toString();
    }
}
