package basics;

public class Lcm {
    public static void main(String[] args) {
        int lcm = lcm(10, 40);
        System.out.println(lcm);
    }

    private static int lcm(int n1, int n2) {
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int remainder = n1%n2;
            n1 = n2;
            n2 = remainder;
        }
        int lcm = (on1*on2)/n2;
        return lcm;
    }
}
