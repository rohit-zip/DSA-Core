package recursion;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: StairsPath
 */

import java.util.ArrayList;
import java.util.List;

/*
  Problem Statement:
  ------------------
  Given a staircase with 'n' steps, you can climb the staircase by taking 1, 2, or 3 steps at a time.
  Print all possible paths to reach the top (step 0 to step n) as strings, where each character in the string
  represents the number of steps taken in a single move.

  Example 1:
    Input: n = 3
    Output: [111, 12, 21, 3]
    Explanation:
      - 111: 1 step + 1 step + 1 step
      - 12: 1 step + 2 steps
      - 21: 2 steps + 1 step
      - 3: 3 steps in one move

  Example 2:
    Input: n = 4
    Output: [1111, 112, 121, 13, 211, 22, 31]
    Explanation:
      All possible combinations to reach the 4th step.

  Constraints:
    - 0 <= n <= 20
*/

/*
  Time Complexity: O(3^n)
  -----------------------
  At each step, the function makes up to 3 recursive calls (for n-1, n-2, n-3).
  The total number of calls grows exponentially with n.

  Space Complexity: O(n)
  ----------------------
  The maximum depth of the recursion stack is n (when only 1-step moves are taken).
  The space for storing all paths is also exponential in the worst case.
*/
public class StairsPath {

    public static void main(String[] args) {
        ArrayList<String> paths = solve(4);
        System.out.println(paths);
    }

    /*
      Time Complexity: O(3^n)
      Space Complexity: O(n) (recursion stack), output space is exponential
      ---------------------------------------------------------------
      This method returns all possible paths to climb 'n' stairs using 1, 2, or 3 steps at a time.
    */
    public static ArrayList<String> solve(int n){
        // Base case: If n == 0, return a list with an empty string (one valid path)
        if (n == 0) return new ArrayList<>(List.of(""));

            // Base case: If n < 0, return an empty list (no valid path)
        else if (n < 0) return new ArrayList<>();

        // Recursive calls: Get all paths for n-1, n-2, and n-3 steps
        ArrayList<String> paths1 = solve(n - 1); // Paths after taking 1 step
        ArrayList<String> paths2 = solve(n - 2); // Paths after taking 2 steps
        ArrayList<String> paths3 = solve(n - 3); // Paths after taking 3 steps

        // List to store all possible paths from current n
        ArrayList<String> paths = new ArrayList<>();

        // For each path from n-1, prepend '1' (representing a 1-step move)
        for (String path : paths1) {
            paths.add(1 + path);
        }

        // For each path from n-2, prepend '2' (representing a 2-step move)
        for (String path : paths2) {
            paths.add(2 + path);
        }

        // For each path from n-3, prepend '3' (representing a 3-step move)
        for (String path : paths3) {
            paths.add(3 + path);
        }

        // Return the list of all possible paths
        return paths;
    }
}
