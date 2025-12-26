package practice;

public class InverseNumber8 {
    public static void main(String[] args) {
        int inverse = inverse(21453);
        System.out.println(inverse);
    }

    private static int inverse(int n) {
        int inv = 0;
        int op = 1;
        while (n != 0) {
            int ad = n % 10;
            int fp = ad;
            int fd = op;

            inv = inv + fd * (int) Math.pow(10, fp - 1);

            n = n/10;
            op++;
        }

        return inv;
    }
}
