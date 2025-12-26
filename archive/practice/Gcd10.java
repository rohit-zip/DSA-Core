package practice;

public class Gcd10 {
    public static void main(String[] args) {
        
        int gcd = gcd(24, 36);
        System.out.println(gcd);

        int lcm = lcm(24, 36);
        System.out.println(lcm);
    }

    private static int gcd(int n1, int n2){
        while (n1 % n2 != 0) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        return n2;
    }

    private static int lcm(int n1, int n2) {
        int gcd = gcd(n1, n2);
        int lcm = (n1 * n2) / gcd;
        return lcm;
    }
}
