package basics;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        boolean isPythagoreanTriplet = isPythagoreanTriplet(5, 3, 4);
        System.out.println(isPythagoreanTriplet);
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        boolean flag;
        if (max == a) {
            flag = ((b * b + c * c) == (a * a));
        } else if (max == b) {
            flag = ((a * a + c * c) == (b * b));
        } else {
            flag = ((a * a + b * b) == (c * c));
        }
        return flag;
    }
}
