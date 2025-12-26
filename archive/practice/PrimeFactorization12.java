package practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization12 {
    public static void main(String[] args) {
        List<Integer> list = optimized(1440);
        System.out.println(list);
    }

    private static List<Integer> primeFactorization(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2 ; i <= n ; i++) {
            while (n % i == 0) {
                n = n / i;
                list.add(i);
            }
        }
        return list;
    }

    private static List<Integer> optimized(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            while (n % i == 0) {
                n = n / i;
                list.add(i);
            }
        }
        if (n != 1) {
            list.add(n);
        }

        return list;
    }
}
