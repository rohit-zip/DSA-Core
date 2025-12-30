package arrays;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {15, 30, 40, 4, 11, 9};
        int index = find(arr, 40);
        System.out.println(index);
    }

    private static int find(int[] arr, int data) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
