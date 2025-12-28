package basics;

import java.util.ArrayList;
import java.util.List;

public class DigitOfNumber {
    public static void main(String[] args) {
        List<Integer> list = digitOfNumber(65784383);
        System.out.println(list);
    }

    private static List<Integer> digitOfNumber(int n) {
        int nod = (int) Math.floor(Math.log10(n));
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            int fp = (int) Math.pow(10, nod);
            int digit = n/fp;
            list.add(digit);
            n = n%fp;
            nod--;
        }
        return list;
    }
}
