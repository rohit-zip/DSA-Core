package revisits;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        List<Integer> list = primeFactorization(1440);
        System.out.println(list);
    }

    private static List<Integer> primeFactorization(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2 ; i * i <= n ; i++) {
            while (n % i == 0) {
                list.add(i);
                n = n/i;
            }
        }

        if (n != 1) {
            list.add(n);
        }

        return list;
    }
}
