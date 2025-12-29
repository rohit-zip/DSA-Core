package basics;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int data = abtd(1172, 8);
        System.out.println(data);
    }

    private static int abtd(int n, int b) {
        int p = 1;
        int data = 0;
        while (n > 0) {
            int ld = n % 10;
            data += ld * p;
            p = p * b;
            n = n / 10;
        }
        return data;
    }
}
