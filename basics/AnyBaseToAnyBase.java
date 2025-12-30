package basics;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        int data = abtab(172, 8, 2);
        System.out.println(data);
    }

    private static int abtab(int n, int b1, int b2) {
        int abtd = abtd(n, b1);
        int dtab = dtab(abtd, b2);
        return dtab;
    }

    private static int abtd(int n, int b) {
        int p = 1;
        int data = 0;
        while (n > 0) {
            int ld = n % 10;
            data += ld * p;
            p = p * b;
            n = n/10;
        }
        return data;
    }

    private static int dtab(int n, int b) {
        int data = 0;
        int p = 1;
        while (n > 0) {
            int rem = n % b;
            data += rem * p;
            p = p * 10;
            n = n/b;
        }
        return data;
    }
}
