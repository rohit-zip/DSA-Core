package basics;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        int data = abs(256, 1212, 8);
        System.out.println(data);
    }

    private static int abs(int n1, int n2, int b) {
        int data = 0;
        int c = 0;
        int p = 1;
        while (n2 > 0) {
            int d1 = n1 % 10;
            n1 = n1/10;
            int d2 = n2 % 10;
            n2 = n2/10;
            int d = 0;
            d2 = d2 + c;

            if (d2 >= d1) {
                c = 0;
                d = d2 - d1;
            } else {
                c = -1;
                d = d2 + 8 - d1;
            }
            data = data + d * p;
            p = p * 10;
        }
        return data;
    }
}
