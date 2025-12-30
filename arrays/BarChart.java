package arrays;

public class BarChart {
    public static void main(String[] args) {
        int[] arr = {3,1,0,7,5};
        printBarChart(arr);
    }

    private static void printBarChart(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        for (int i = max ; i >=1 ; i-- ) {
            for (int j = 0 ; j < arr.length ; j++) {
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
