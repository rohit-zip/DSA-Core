package archive.twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ShellRotate
 */

import java.util.Scanner;

/*
 * Problem Statement:
 * Given a 2D array (matrix), perform a shell rotation on a specified shell (layer) of the matrix.
 * A shell is a concentric layer of the matrix, starting from the outermost layer (shell 1).
 * Rotate the elements of the specified shell by a given number of positions in a clockwise direction.
 *
 * Input:
 * - The first line contains two integers, row and col, representing the number of rows and columns.
 * - The next row*col integers represent the elements of the matrix.
 * - The shell number (1-based) and the number of rotations.
 *
 * Output:
 * - The matrix after rotating the specified shell.
 *
 * Example:
 * Input:
 * 4 4
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * Shell: 2
 * Rotate: 2
 *
 * Output:
 * 1 2 3 4
 * 5 11 10 8
 * 9 7 6 12
 * 13 14 15 16
 */
public class ShellRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i=0 ; i<arr.length ; i++) {
            for (int j=0 ; j<arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int shell = 1;
        int rotate = 2;

        shellRotate(arr, shell, rotate);

        for (int i=0 ; i<arr.length ; i++) {
            for (int j=0 ; j<arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Time Complexity: O(M+N), where M and N are the number of rows and columns.
     * Space Complexity: O(M+N), for the temporary 1D array used for the shell.
     *
     * Rotates the specified shell of the matrix by the given number of positions.
     */
    private static void shellRotate(int[][] arr, int shell, int rotate) {
        int[] oned = fillOnedFromShell(arr, shell);
        doRotate(oned, rotate);
        fillShellFromOned(arr, shell, oned);
    }

    /**
     * Time Complexity: O(M+N), where M and N are the number of rows and columns.
     * Space Complexity: O(M+N), for the 1D array created from the shell.
     *
     * Extracts the elements of the specified shell into a 1D array.
     */
    private static int[] fillOnedFromShell(int[][] arr, int shell) {
        int minRow = shell - 1;
        int minCol = shell - 1;
        int maxRow = arr.length - shell;
        int maxCol = arr[0].length - shell;

        int size = 2 * (maxRow - minRow + maxCol - minCol);

        int[] oned = new int[size];

        int idx = 0;

        // lw
        for (int i=minRow, j = minCol ; i<=maxRow ; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }

        // bw
        for (int i=maxRow, j = minCol + 1 ; j<=maxCol ; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }

        // rw
        for (int i=maxRow - 1, j = maxCol ; i>=minRow ; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }

        // tw
        for (int i=minRow, j = maxCol - 1 ; j>= minCol + 1 ; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;
    }

    /**
     * Time Complexity: O(M+N), where M and N are the number of rows and columns.
     * Space Complexity: O(1), as it modifies the matrix in place.
     *
     * Fills the specified shell of the matrix with elements from the 1D array.
     */
    private static void fillShellFromOned(int[][] arr, int shell, int[] oned) {
        int minRow = shell - 1;
        int minCol = shell - 1;
        int maxRow = arr.length - shell;
        int maxCol = arr[0].length - shell;

        int idx = 0;

        // lw
        for (int i=minRow, j = minCol ; i<=maxRow ; i++) {
            arr[i][j] = oned[idx];
            idx++;
        }

        // bw
        for (int i=maxRow, j = minCol + 1 ; j<=maxCol ; j++) {
            arr[i][j] = oned[idx];
            idx++;
        }

        // rw
        for (int i=maxRow - 1, j = maxCol ; i>=minRow ; i--) {
            arr[i][j] = oned[idx];
            idx++;
        }

        // tw
        for (int i=minRow, j = maxCol - 1 ; j>= minCol + 1 ; j--) {
            arr[i][j] = oned[idx];
            idx++;
        }
    }

    /**
     * Time Complexity: O(L), where L is the length of the array.
     * Space Complexity: O(1), in-place rotation.
     *
     * Rotates the 1D array by the given number of positions.
     */
    private static void doRotate(int[] arr, int rotate) {
        rotate = rotate % arr.length;
        if (rotate < 0) rotate = rotate + arr.length;

        // reverse 1st
        reverse(arr, 0, arr.length - 1 - rotate);
        // reverse 2nd
        reverse(arr, arr.length - rotate, arr.length - 1);
        // reverse whole
        reverse(arr, 0, arr.length - 1);
    }

    /**
     * Time Complexity: O(H-L), where H and L are the high and low indices.
     * Space Complexity: O(1), in-place reversal.
     *
     * Reverses the elements in the array from index l to h.
     */
    private static void reverse(int[] arr, int l, int h) {
        while (l < h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
}
