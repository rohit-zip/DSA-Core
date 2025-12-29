package basics;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        int data = dtb(634, 8);
        System.out.println(data);
    }

    private static int dtb(int n, int b) {
        int data = 0;
        int p = 1;
        while (n > 0) {
            int rem = n % b;
            n = n / b;
            data += rem * p;
            p = p * 10;
        }
        return data;
    }
}
