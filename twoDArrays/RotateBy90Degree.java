package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: RotateBy90Degree
 */

import java.util.Scanner;

/*
  Problem Statement:
  Given a 2D matrix of size N x N, rotate the matrix by 90 degrees clockwise in-place.

  Input:
    - The first line contains two integers N (number of rows) and N (number of columns).
    - The next N lines each contain N integers representing the matrix.

  Output:
    - Print the rotated matrix, each row on a new line, elements separated by tabs.

  Example 1:
    Input:
      3 3
      1 2 3
      4 5 6
      7 8 9
    Output:
      7	4	1
      8	5	2
      9	6	3

  Example 2:
    Input:
      2 2
      1 2
      3 4
    Output:
      3	1
      4	2
 */
public class RotateBy90Degree {

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

        solve(arr);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.err.print(arr[i][j] + "\t");
            }
            System.err.println();
        }
    }

    /**
     * Time Complexity: O(N^2)
     *   - Transposing the matrix takes O(N^2) time.
     *   - Reversing each row also takes O(N^2) time.
     *   - Total: O(N^2)
     *
     * Space Complexity: O(1)
     *   - The rotation is done in-place, so no extra space is used except for a few variables.
     */
    private static void solve(int[][] arr) {

        // Transpose
        for (int i=0 ; i<arr.length; i++){
            for (int j=i ; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse Each row
        for (int i=0 ; i<arr.length; i++){
            int l = 0;
            int h = arr[i].length-1;

            while (l < h) {
                int temp = arr[i][l];
                arr[i][l] = arr[i][h];
                arr[i][h] = temp;

                l++;
                h--;
            }
        }
    }
}
