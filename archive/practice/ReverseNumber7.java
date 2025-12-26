package practice;

public class ReverseNumber7 {
    public static void main(String[] args) {
        int number = reverse(124);
        System.out.println(number);
    }

    private static int reverse(int data) {
        int rn = 0;
        while (data != 0) {
            int digit = data % 10;
            rn = rn * 10 + digit;
            data = data / 10;
        }

        return rn;
    }
}
