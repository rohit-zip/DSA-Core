package archive.twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SpiralTraversal
 */

import java.util.Scanner;

public class SpiralTraversal {

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

        spiralTraversal(arr);
    }

    private static void spiralTraversal(int[][] arr) {
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;
        int maxElements = arr.length * arr[0].length;
        int counter = 0;
        while (counter < maxElements) {
            // left wall
            for (int i = minRow, j = minCol ; i <= maxRow && counter < maxElements; i++) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minCol++;

            // bottom wall
            for (int i = maxRow, j = minCol ; j <= maxCol && counter < maxElements; j++) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxRow--;

            // right wall
            for (int i=maxRow, j = maxCol ; i >= minRow && counter < maxElements; i--) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            maxCol--;

            // top wall
            for (int i = minRow, j = maxCol ; j>=minCol && counter < maxElements ; j--) {
                System.out.print(arr[i][j] + " ");
                counter++;
            }
            minRow++;
        }
    }
}
