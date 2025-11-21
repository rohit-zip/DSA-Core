package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ShellRotate
 */

import java.util.Scanner;

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

    private static void shellRotate(int[][] arr, int shell, int rotate) {
        int[] oned = fillOnedFromShell(arr, shell);
        doRotate(oned, rotate);
        fillShellFromOned(arr, shell, oned);
    }

    private static int[] fillOnedFromShell(int[][] arr, int shell) {
        int minRow = shell - 1;
        int minCol = shell - 1;
        int maxRow = arr.length - shell;
        int maxCol = arr[0].length - shell;

        // Array Size
        // int size = lw + bw + rw + tw - 4
        // int size = (maxRow - minRow + 1) + (maxCol - minCol + 1) + (maxRow - minRow + 1) * (maxCol - minCol + 1) - 4;
        // int size = 2 * (maxRow - minRow + 1) +  2 * (maxCol - minCol + 1) - 4;
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
