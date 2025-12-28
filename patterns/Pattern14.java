package patterns;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(7);
    }

    private static void pattern14(int n) {
        for (int i = 1 ; i <= 10 ; i++) {
            int value = n * i;
            System.out.println(n + " * " + i + " = " + value);
        }
    }
}
