package archive.twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: DiagonalTraversal
 */

import java.util.Scanner;

/**
 * Problem: Diagonal Traversal of a 2D array (top-left to bottom-right)
 * Given a 2D integer matrix of size rows x cols, print elements of the matrix along each diagonal
 * starting from the top row (left to right) and then from the leftmost column (top to bottom),
 * traversing each diagonal from its starting cell towards bottom-right.
 *
 * Example:
 * Input:
 * 3 4
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 *
 * Output:
 * 1
 * 2
 * 5
 * 3
 * 6
 * 9
 * 4
 * 7
 * 10
 * 8
 * 11
 * 12
 *
 * Explanation: Diagonals are printed in order starting at (0,0),(0,1),(0,2),(0,3),(1,0),(2,0)
 */
public class DiagonalTraversal {

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

        printDiagonalTraversal(arr);
    }

    /*
     Time Complexity: O(rows * cols)
     Space Complexity: O(1)

     Explanation:
     - Each element of the matrix is visited exactly once while traversing all diagonals.
     - There are rows * cols elements total, so the traversal costs O(rows * cols).
     - Only a constant number of extra variables are used (indices and loop counters), so space is O(1).
    */
    private static void printDiagonalTraversal(int[][] arr) {
        int rows = arr.length;
        if (rows == 0) return;
        int cols = arr[0].length;

        // Start from each column in the top row
        for (int startCol = 0; startCol < cols; startCol++) {
            int i = 0, j = startCol;
            while (i < rows && j < cols) {
                System.out.println(arr[i][j]);
                i++;
                j++;
            }
        }

        // Start from each row in the leftmost column (excluding the top-left cell already handled)
        for (int startRow = 1; startRow < rows; startRow++) {
            int i = startRow, j = 0;
            while (i < rows && j < cols) {
                System.out.println(arr[i][j]);
                i++;
                j++;
            }
        }
    }
}
