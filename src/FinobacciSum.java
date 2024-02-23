import java.util.Scanner;

public class FinobacciSum {
    public static void main(String[] args) {
        System.out.println("Welcome to fibonacci Series");
        System.out.print("Please Enter the value to find the fibonacci number: ");
        Scanner s = new Scanner(System.in);
        int input = Integer.parseInt(s.next());
        int res = fibn(input);
        if (res == -1) {
            System.out.println("Invalid Input");
        }
        System.out.println(fibn(input));
    }

    public static int fibn(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (n < 0) {
            return -1;
        }
        return fibn(n - 1) + fibn(n - 2);
    }
}
