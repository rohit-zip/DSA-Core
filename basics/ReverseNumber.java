package basics;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse = reverse(1234);
        System.out.println(reverse);
    }

    private static int reverse(int n) {
        int rn = 0;
        while (n != 0) {
            int digit = n % 10;
            rn = rn * 10 + digit;
            n = n/10;
        }
        return rn;
    }
}
