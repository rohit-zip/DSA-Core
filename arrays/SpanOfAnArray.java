package arrays;

public class SpanOfAnArray {
    public static void main(String[] args) {
        int[] arr = {15, 30, 40, 4, 11};
        int data = span(arr);
        System.out.println(data);
    }

    private static int span(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }
}
