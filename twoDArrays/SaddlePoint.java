package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SaddlePoint
 */

import java.util.Scanner;

/*
Problem:
Given a 2D integer matrix of size n x m, find a saddle point.
A saddle point is defined here as an element that is the minimum in its row
and simultaneously the maximum in its column.
If a saddle point exists, print its value; otherwise print "Invalid Input".

Examples:
1) Input:
3 3
11 12 13
21 5 14
31 6 15
Output:
6
Explanation: 6 is minimum in its row [31,6,15] and maximum in its column [13,14,15]? (example adjusted for clarity)
2) Input:
2 2
1 2
3 4
Output:
Invalid Input
*/

/*
Note:
The above examples illustrate the expected I/O format:
First two integers are row and col, followed by row*col integers for the matrix.
*/
public class SaddlePoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solve(arr));
    }

    /*
    Time Complexity: O(n * m)
    Explanation: For each of the n rows we scan all m columns once to find the row minimum
    and then in the worst case scan up to n elements in the corresponding column to verify
    it is the maximum in that column. The dominant cost is proportional to n*m.

    Space Complexity: O(1) additional space (excluding input)
    Explanation: The algorithm uses only a handful of primitive variables (indices and a flag).
    The input matrix itself is provided to the function and not counted as extra workspace here.
    */
    private static String solve(int[][] arr) { // method that finds and returns the saddle point or "Invalid Input"
        for (int i = 0; i < arr.length; i++) { // iterate over each row index i (arr.length is number of rows)
            int svj = 0; // svj holds the column index of the smallest element found so far in the current row
            for (int j = 1; j < arr[i].length; j++) { // iterate columns from 1 to end to find row minimum
                if (arr[i][j] < arr[i][svj]) { // compare current element arr[i][j] with current row-min arr[i][svj]
                    svj = j; // update svj to j because arr[i][j] is smaller
                }
            }

            boolean flag = true; // assume the found row-min is a saddle candidate until proven otherwise

            for (int k = 0; k < arr.length; k++) { // iterate down the column svj to check column values
                if (arr[k][svj] > arr[i][svj]) { // if any element in column svj is greater than the candidate,
                    flag = false; // then the candidate is not the maximum in its column
                    break; // exit the column scan early since candidate failed the condition
                }
            }

            if (flag) { // if candidate remained valid after column check
                return arr[i][svj] + ""; // return the saddle point as a String (concatenate with empty string)
            }
        }

        return "Invalid Input"; // no saddle point found after checking all rows
    }
}
