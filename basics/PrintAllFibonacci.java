package basics;

import java.util.ArrayList;
import java.util.List;

public class PrintAllFibonacci {
    public static void main(String[] args) {
        List<Integer> list = print(10);
        System.out.println(list);
    }

    private static List<Integer> print(int n) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        for (int i=0 ; i<=n ; i++) {
            list.add(a);
            int c = a + b;
            a = b;
            b = c;
        }
        return list;
    }
}
