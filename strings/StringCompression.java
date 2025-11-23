package strings;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: StringCompression
 */

/*
  Problem Statement:
  Given a string, compress it using the counts of repeated characters.
  For each group of consecutive repeating characters, replace the group with the character followed by the count of repetitions (if the count is more than 1).
  If a character appears only once consecutively, do not append the count.

  Examples:
    Input:  "aaabbcccddaeef"
    Output: "a3b2c3d2ae2f"

    Input:  "abcd"
    Output: "abcd"

    Input:  "aabbcc"
    Output: "a2b2c2"
*/
public class StringCompression {

    public static void main(String[] args) {
        String str = "aaabbcccddaeef";
        String data = solve(str);
        System.out.println(data);
    }

    /*
      Time Complexity: O(n), where n is the length of the input string.
      - We iterate through the string once, processing each character.

      Space Complexity: O(n), for the StringBuilder output.
      - In the worst case (no repeats), the output is the same length as the input.
    */
    private static String solve(String str) {
        // Initialize count for consecutive characters
        int count = 1;
        // StringBuilder to build the compressed string efficiently
        StringBuilder sb = new StringBuilder();
        // Append the first character (since we always start with it)
        sb.append(str.charAt(0));
        // Loop through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // If current character is same as previous, increment count
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // If count > 1, append the count to the result
                if (count > 1) {
                    sb.append(count);
                    // Reset count for the new character
                    count = 1;
                }
                // Append the new character
                sb.append(str.charAt(i));
            }
        }
        // After the loop, check if the last group had repeats
        if (count > 1) {
            sb.append(count);
        }
        // Return the compressed string
        return sb.toString();
    }
}
