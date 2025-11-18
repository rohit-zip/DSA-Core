package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Input
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row =  sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i=0 ; i<row ; i++) {
            for (int j=0 ; j<col ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0 ; i<arr.length ; i++) {
            for (int j=0 ; j<arr[i].length ; j++) {
                System.out.print(arr[i][j] + "\t|\t");
            }
            System.out.println();
        }
    }
}
