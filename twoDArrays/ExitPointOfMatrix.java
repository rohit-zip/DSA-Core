package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ExitPointOfMatrix
 */

import java.util.Scanner;

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
