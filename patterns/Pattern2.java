package patterns;

public class Pattern2 {
    public static void main(String[] args) {
        pattern2(5);
    }

    private static void pattern2(int n) {
        for (int i = n ; i >= 1 ; i--) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
