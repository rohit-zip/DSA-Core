package patterns;

public class Pattern7 {
    public static void main(String[] args) {
        optimized(5);
    }

    private static void pattern7(int n) {
        int space = 0;
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= space ; j++) {
                System.out.print("\t");
            }

            System.out.print("*\t");
            space++;
            System.out.println();
        }
    }

    private static void optimized(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
