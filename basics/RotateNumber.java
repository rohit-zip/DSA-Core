package basics;

public class RotateNumber {
    public static void main(String[] args) {
        int rotate = rotate(745748, 2);
        System.out.println(rotate);
    }

    private static int rotate(int n, int k) {
        int nod = (int) Math.floor(Math.log10(n)) + 1;
        int lastDigit = n % (int) Math.pow(10, k);
        int remainingDigit = n / (int) Math.pow(10, k);
        return lastDigit * (int) Math.pow(10, nod - k) + remainingDigit;
    }
}
