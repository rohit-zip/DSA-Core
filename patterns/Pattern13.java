package patterns;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(7);
    }

    private static void pattern13(int n) {
        for (int i = 0 ; i < n ; i++) {
            int val = 1;
            for (int j = 0 ; j <= i ; j++) {
                System.out.print(val + "\t");
                int newValue = val * (i - j)/ (j + 1);
                val = newValue;
            }
            System.out.println();
        }
    }
}
