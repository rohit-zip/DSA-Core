package patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    private static void pattern9(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n ; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
