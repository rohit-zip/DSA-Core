package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Search
 */

import java.util.Scanner;

/*
  Problem Statement:
  Given a 2D matrix where each row and each column is sorted in ascending order,
  search for a given integer `data` in the matrix. If found, print its position (row and column).
  If not found, print "Not found".

  Examples:
  Input:
  3 4
  1 4 7 11
  2 5 8 12
  3 6 9 16

  Output:
  Row : 2 Col : 1   // if data = 6

  Input:
  2 2
  1 2
  3 4

  Output:
  Not found         // if data = 10
 */
public class Search {

    /**
     * Time Complexity: O(n + m), where n is the number of rows and m is the number of columns.
     * Explanation: In the worst case, we traverse at most n rows and m columns (starting from the top-right corner and moving only left or down).
     * Space Complexity: O(1), as we use only a constant amount of extra space.
     */
    public static void searchInSortedMatrix(int[][] arr, int data) {
        // Start from the top-right corner of the matrix
        int i = 0; // row index
        int j = arr[0].length - 1; // column index

        // Loop until we go out of bounds
        while (i < arr.length && j >= 0) {
            // If the current element matches the data, print its position and return
            if (data == arr[i][j]) {
                System.out.println("Row : " + i + " Col : " + j);
                return;
            }
            // If the data is less than the current element, move left in the row
            else if (data < arr[i][j]) {
                j--;
            }
            // If the data is greater, move down to the next row
            else {
                i++;
            }
        }
        // If not found, print "Not found"
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the number of rows and columns from the user
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Initialize a 2D array with the given dimensions
        int[][] arr = new int[row][col];

        // Read the elements of the 2D array from the user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // The value to search for in the matrix
        int data = 10;

        // Call the search function to find the data in the matrix
        searchInSortedMatrix(arr, data);
    }
}
