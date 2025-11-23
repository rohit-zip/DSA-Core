package list;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: RemovePrimeNumbers
 */

import java.util.ArrayList;
import java.util.List;

/*
  Problem Statement:
  ------------------
  Given a list of integers, remove all prime numbers from the list in-place.
  The function should modify the original list and remove any element that is a prime number.

  Examples:
  ---------
  Input:  [8, 7, 9, 17, 8, 6, 42]
  Output: [8, 9, 8, 6, 42]

  Input:  [2, 3, 4, 5, 6]
  Output: [4, 6]

  Input:  [11, 13, 17]
  Output: []

  Constraints:
  ------------
  - The list may contain positive integers only.
  - The operation should be performed in-place.
*/
public class RemovePrimeNumbers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(8, 7, 9, 17, 8, 6, 42));
        solve(list);
        System.out.println(list);
    }

    /*
      Time Complexity: O(n * sqrt(m)), where n is the number of elements in the list,
      and m is the maximum value in the list. For each element, we check if it is prime,
      which takes O(sqrt(m)) time.

      Space Complexity: O(1), as the operation is performed in-place and uses constant extra space.
    */
    private static void solve(List<Integer> list) {
        // Iterate over the list in reverse to avoid index shifting issues when removing elements
        for (int i = list.size() - 1; i >= 0; i--) {
            // Get the element at index i
            int num = list.get(i);
            // Check if the element is a prime number
            if (isPrime(num)) {
                // If prime, remove it from the list
                list.remove(i);
            }
        }
    }

    /*
      Time Complexity: O(sqrt(num)), where num is the value being checked.
      We only check divisibility up to the square root of num.

      Space Complexity: O(1), as only a constant amount of extra space is used.
    */
    private static boolean isPrime(Integer num) {
        // Handle edge cases: numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }
        // Initialize count of divisors
        int count = 0;
        // Loop from 1 to square root of num to count divisors
        for (int i = 1; i <= Math.sqrt(num); i++) {
            // If i divides num evenly
            if (num % i == 0) {
                count++; // i is a divisor
                // If i is not the square root, count the paired divisor
                if (num / i != i) {
                    count++;
                }
            }
        }
        // A prime number has exactly two divisors: 1 and itself
        return count == 2;
    }
}
