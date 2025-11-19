package recursion;

/*
  Problem Statement:
  ------------------
  Implement the Tower of Hanoi algorithm using recursion. Given three rods and 'n' disks,
  the objective is to move all the disks from the source rod to the destination rod
  following these rules:
    1. Only one disk can be moved at a time.
    2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
    3. No larger disk may be placed on top of a smaller disk.

  Input:
    n   : Number of disks
    t1  : Source rod number
    t2  : Destination rod number
    t3  : Auxiliary rod number

  Output:
    Print the steps to move all disks from the source rod to the destination rod.

  Example:
    Input: n = 2, t1 = 1, t2 = 2, t3 = 3
    Output:
      1[1->2]
      2[1->3]
      1[2->3]

    Input: n = 3, t1 = 1, t2 = 2, t3 = 3
    Output:
      1[1->2]
      2[1->3]
      1[2->3]
      3[1->2]
      1[3->1]
      2[3->2]
      1[1->2]
 */

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: TowerOfHanoi
 */

public class TowerOfHanoi {

    /**
     * Time Complexity: O(2^n)
     *   - Each call to toh makes two recursive calls for n-1 disks, leading to 2^n total calls.
     * Space Complexity: O(n)
     *   - The maximum depth of the recursion stack is n.
     */
    public static void main(String[] args) {
        toh(3, 1, 2, 3);
    }

    /**
     * Time Complexity: O(2^n)
     *   - Explanation: For each disk, the function makes two recursive calls for n-1 disks,
     *     plus one constant-time move operation. This forms the recurrence:
     *         T(n) = 2*T(n-1) + O(1)
     *     Solving this recurrence gives T(n) = O(2^n).
     * Space Complexity: O(n)
     *   - The recursion stack can go as deep as n.
     */
    private static void toh(int n, int t1, int t2, int t3) {
        if (n==0) return;
        toh(n-1 , t1, t3, t2);
        System.out.println(n + "[" + t1 + "->" + t2 + "]");
        toh(n-1, t3, t2, t1);
    }
}
