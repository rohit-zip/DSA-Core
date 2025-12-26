package practice;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPrime4 {
    public static void main(String[] args) {
        int low = 4, high = 10;
        List<Integer> list = printAllPrime(low, high);
        System.err.println(list);
    }

    private static List<Integer> printAllPrime(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for (int i = low ; i <= high ; i++) {
            int count = 0;

            for (int j = 1 ; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    count++;
                    if (i/j != j) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                list.add(i);
            }
        }
        return list;
    }
}
