package practice;

public class CountDigits5 {

    public static void main(String[] args) {
        int digits = countDigits(1234);
        System.out.println(digits);
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
