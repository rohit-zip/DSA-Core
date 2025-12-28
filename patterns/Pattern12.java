package patterns;

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    private static void pattern12(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
