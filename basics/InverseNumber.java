package basics;

public class InverseNumber {
    public static void main(String[] args) {
        int inverse = inverse(426135);
        System.out.println(inverse);
    }

    private static int inverse(int n) {
        int place = 1;
        int inverse = 0;
        while (n != 0) {
            int digit = n%10;
            int newDigit = place;
            int newPlace = digit;
            inverse = inverse + newDigit * (int) Math.pow(10, newPlace - 1);
            n = n/10;
            place++;
        }
        return inverse;
    }
}
