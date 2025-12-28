package patterns;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    private static void pattern8(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n-i ; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
        }
    }
}
