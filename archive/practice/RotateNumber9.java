package practice;

public class RotateNumber9 {
    public static void main(String[] args) {
        int rotate = rotate(273516, 2);
        System.out.println(rotate);
    }

    private static int rotate(int n, int k) {
        int nod = countDigits(n);
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        int div = 1;
        int mult = 1;
        for (int i = 1 ; i <= nod ; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        int rd = n % div;
        int od = n / div;
        
        return rd * mult + od;
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n/10;
        }

        return count;
    }
}
