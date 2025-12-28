package basics;

import java.util.ArrayList;
import java.util.List;

public class BenjaminBulbs {
    public static void main(String[] args) {
        List<Integer> list = benjaminBulbs(20);
        System.out.println(list);
    }

    private static List<Integer> benjaminBulbs(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1 ; i * i <= n ; i++) {
            list.add(i * i);
        }
        return list;
    }
}
