package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: WaveTraversal
 */

import java.util.Scanner;

/*
  Problem Statement:
  Given a 2D array of size `row x col`, print its elements in a "wave traversal" order.
  In wave traversal, for every column, if the column index is even, print top to bottom;
  if the column index is odd, print bottom to top.

  Example 1:
  Input:
    3 4
    1 2 3 4
    5 6 7 8
    9 10 11 12
  Output:
    1 5 9 10 6 2 3 7 11 12 8 4

  Example 2:
  Input:
    2 3
    1 2 3
    4 5 6
  Output:
    1 4 5 2 3 6
*/

public class WaveTraversal {
    /*
      Time Complexity: O(row * col)
      - Each element of the matrix is visited exactly once.

      Space Complexity: O(1)
      - No extra space is used except for loop variables.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        waveTraversal(arr);
    }

    /*
      Time Complexity: O(row * col)
      - Iterates through all columns and all rows for each column.

      Space Complexity: O(1)
      - Only uses variables for iteration.
    */
    private static void waveTraversal(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i=0 ; i<col ; i++) {
            if (i%2 == 0) {
                for ( int j=0 ; j<row ; j++ ) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = row - 1 ; j>=0 ; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
