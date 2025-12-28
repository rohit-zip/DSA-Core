package patterns;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    private static void pattern11(int n) {
        int counter = 1;

        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(counter++ + "\t");
            }
            System.out.println();
        }
    }
}
