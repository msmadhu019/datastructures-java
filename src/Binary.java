import java.sql.SQLOutput;

public class Binary {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(binary(n));
    }

    public static int binary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + binary(n / 2) * 10;
    }
}
