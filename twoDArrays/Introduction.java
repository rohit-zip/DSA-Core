package twoDArrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Introduction
 */

/**
 * A 2D array in Java is an array of arrays, often used to represent matrices or grids.
 * It is declared as `dataType[][] arrayName;` and instantiated with `new dataType[rows][columns];`.
 * Each element is accessed using two indices: `arrayName[row][column]`.
 * Example:
 *   int[][] arr = new int[3][4]; // 3 rows, 4 columns
 *   arr[0][1] = 5; // Sets the element at first row, second column to 5
 * 2D arrays can also be initialized directly:
 *   int[][] arr = { {1, 2}, {3, 4}, {5, 6} };
 * The size of each row can vary (jagged arrays), but in standard 2D arrays, all rows have the same length.
 */
public class Introduction {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[3][4];
    }
}
