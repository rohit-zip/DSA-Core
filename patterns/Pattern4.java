package patterns;

public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }

    private static void pattern4(int n) {
        for (int i = n ; i >= 1 ; i--) {
            int space = n - i;

            for (int j = 1 ; j <= space ; j++) {
                System.out.print("\t");
            }

            for (int k = 1 ; k <= i ; k++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}