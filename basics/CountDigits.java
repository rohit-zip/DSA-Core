package basics;

public class CountDigits {
    public static void main(String[] args) {
        int digits = optimized(934562);
        System.out.println(digits);
    }

    private static int countDigits(int n) {
        int counter = 0;
        while (n != 0) {
            counter++;
            n = n/10;
        }
        return counter;
    }

    private static int optimized(int n) {
        if (n == 0) {
            return 1;
        }
        return (int) Math.floor(Math.log10(n)) + 1;
    }
}
