package basics;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: IsPrime
 */

public class IsPrime {

  public static void main(String[] args) {
    boolean isPrime = isPrime(4);
    System.out.println(isPrime);
  }

  private static boolean isPrime(int n) {
    int count = 0;
    for (int i = 1 ; i * i <= n ; i++) {
      if (n % i == 0) {
        count++;
        if (n/i != i) {
          count++;
        }
      }
    }
    return count == 2;
  }
}
