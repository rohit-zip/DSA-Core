package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: AsciiDifference
 */

/*
  Problem Statement:
  Given a string, generate a new string such that between every pair of adjacent characters,
  you insert the difference of their ASCII values. The output string starts with the first character,
  then for each subsequent character, append the ASCII difference (current - previous) followed by the character.

  Examples:
  Input:  "abdgca"
  Output: "a1b2d3g-1c-2a"
  Explanation:
    'a' to 'b' -> 98-97 = 1, so append 1 and 'b'
    'b' to 'd' -> 100-98 = 2, so append 2 and 'd'
    'd' to 'g' -> 103-100 = 3, so append 3 and 'g'
    'g' to 'c' -> 99-103 = -4, so append -4 and 'c'
    'c' to 'a' -> 97-99 = -2, so append -2 and 'a'
    Final string: a1b2d3g-4c-2a

  Input:  "ace"
  Output: "a2c2e"
  Explanation:
    'a' to 'c' -> 99-97 = 2, so append 2 and 'c'
    'c' to 'e' -> 101-99 = 2, so append 2 and 'e'
    Final string: a2c2e
 */
public class AsciiDifference {

    public static void main(String[] args) {
        String str = "abdgca";
        String data = solve(str);
        System.out.println(data);
    }

    /*
      Time Complexity: O(n), where n is the length of the input string.
      Explanation: The method iterates through the string once, performing constant-time operations per character.

      Space Complexity: O(n), where n is the length of the input string.
      Explanation: The StringBuilder stores the result, which in the worst case is proportional to the input size.
     */
    private static String solve(String str) {
        // Create a StringBuilder to efficiently build the result string
        StringBuilder sb = new StringBuilder();
        // Append the first character of the input string to the result
        sb.append(str.charAt(0));
        // Loop through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // Get the current character
            char ch = str.charAt(i);
            // Calculate the ASCII difference between current and previous character
            int diff = ch - str.charAt(i - 1);
            // Append the difference to the result
            sb.append(diff);
            // Append the current character to the result
            sb.append(ch);
        }
        // Convert the StringBuilder to a String and return
        return sb.toString();
    }
}
