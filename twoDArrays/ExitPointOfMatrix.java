package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ExitPointOfMatrix
 */

import java.util.Scanner;

/*
  Problem Statement:
  ------------------
  Given a 2D matrix of size m x n consisting of only 0s and 1s, you start from the top-left cell (0,0) and move in the following way:
    - Start facing east (right).
    - At each cell, add the value of the cell to your current direction (0: east, 1: south, 2: west, 3: north) and take modulo 4.
    - Move one step in the new direction.
    - If you move outside the matrix, print the last valid cell (row, column) before exiting.

  Examples:
  ---------
  Input:
    4 4
    0 0 1 0
    1 0 0 0
    0 0 0 0
    1 0 1 0
  Output:
    Row is 2 and Column is 3

  Input:
    3 3
    0 1 0
    0 1 0
    0 0 0
  Output:
    Row is 2 and Column is 2
 */
public class ExitPointOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        String data = solve(matrix);
        System.err.println(data);
    }

    /**
     * Time Complexity: O(m \* n)
     *   - In the worst case, every cell is visited at most once, so the time complexity is proportional to the number of cells.
     * Space Complexity: O(1)
     *   - Only a constant amount of extra space is used for variables.
     */
    private static String solve(int[][] matrix) {
        int dir = 0;
        int i = 0;
        int j = 0;

        while (true) {
            dir = (dir + matrix[i][j]) % 4;
            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else {
                i--;
            }

            if (i<0) {
                i++;
                break;
            } else if (j<0) {
                j++;
                break;
            } else if (i == matrix.length) {
                i--;
                break;
            } else if (j == matrix[0].length) {
                j--;
                break;
            }
        }

        return String.format("Row is %s and Column is %s", i, j);
    }
}
