package archive.arrays;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: SubsetsOfArray
 */

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int limit = (int) Math.pow(2, arr.length);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            String data = "";
            int temp = i;
            for (int j = arr.length - 1 ; j >= 0 ; j--) {
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0) {
                    data = "-" + data;
                } else {
                    data = arr[j] + data;
                }
            }
            list.add(data);
        }
        System.err.println(list);
    }
}
