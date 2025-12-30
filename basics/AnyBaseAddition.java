package basics;

public class AnyBaseAddition {
    public static void main(String[] args) {
        int data = aba(236, 754, 8);
        System.out.println(data);
    }

    private static int aba(int n1, int n2, int b) {
        int c = 0;
        int data = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int n1ld = n1 % 10;
            int n2ld = n2 % 10;
            int sum = n1ld + n2ld + c;
            c = sum / b;
            int sumrem = sum % b;
            data += sumrem * p;
            p = 10 * p;

            n1 = n1/10;
            n2 = n2/10;
        }
        return data;
    }
}
