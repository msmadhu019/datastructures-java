public class GCD {
    public static void main(String[] args) {
        int a = 100, b = 25;
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
