package practice;

public class PythogoreanTriplets13 {
    
    public static void main(String[] args) {
        int a = 5, b = 3, c = 4;
        boolean isTrue = pythagoreanTriplet(a, b, c);
        System.out.println(isTrue);
    }

    private static boolean pythagoreanTriplet(int a, int b, int c) {
        int max = a;
        if (b >= max) {
            max = b;
        }

        if (c >= max) {
            max = c;
        }
        boolean flag = false;
        if (max == a) {
            flag = ((b * b + c * c) == (a * a));
        } else if (max == b) {
            flag = ((a * a + c * c) == (b * b));
        } else {
            flag = ((b * b + a * a) == (c * c));
        }

        return flag;
    }
}
