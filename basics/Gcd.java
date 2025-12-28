package basics;

public class Gcd {
    public static void main(String[] args) {
        int gcd = betterApproach(24, 36);
        System.out.println(gcd);
    }

    private static int gcd(int n1, int n2) {
        while (n1 % n2 != 0) {
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }

    private static int iterative(int n1, int n2) {
        int gcd = 1;
        for (int i = 1 ; i <= Math.min(n1, n2) ; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int betterApproach(int n1, int n2) {
        for (int i = Math.min(n1, n2) ; i>0 ; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
