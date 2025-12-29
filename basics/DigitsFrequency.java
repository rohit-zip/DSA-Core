package basics;

public class DigitsFrequency {
    public static void main(String[] args) {
        int freq = frequency(95439692, 9);
        System.out.println(freq);
    }

    private static int frequency(int n, int freq) {
        int counter = 0;

        while (n != 0) {
            if (n % 10 == freq) {
                counter++;
            }
            n = n/10;
        }

        return counter;
    }
}
