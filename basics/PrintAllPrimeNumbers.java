package basics;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        int low = 10;
        int high = 100;
        List<Integer> list = printAll(low, high);
        System.out.println(list);
    }

    private static List<Integer> printAll(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = low ; i <= high ; i++) {
            int count = 0;
            for (int j = 2 ; j*j <= i ; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
