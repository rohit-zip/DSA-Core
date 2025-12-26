package practice;

import java.util.ArrayList;
import java.util.List;

public class DigitsOfNumber6 {
    public static void main(String[] args) {
        List<Integer> list = digits(634634);
        System.out.println(list);
    }

    private static List<Integer> digits(int n) {
        List<Integer> list = new ArrayList<>();
        int nod = countDigits(n);
        int pd = (int) Math.pow(10, nod - 1);

        while (pd != 0) {
            list.add(n / pd);
            n = n % pd;
            pd = pd / 10;
        }

        return list;
    }

    private static int countDigits(int n) {
        int count  = 0;
        while(n != 0) {
            count++;
            n = n/10;
        
        }
        return count;
    }
}
