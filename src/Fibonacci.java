public class Fibonacci {
    public static void main(String[] args) {
        int n=19;
        if (fibn(n) == -1) {
            System.out.println("Invalid input");
        }
        System.out.println("The "+n+"th number of Fibonacci Series is: "+fibi(n));
        System.out.println("The "+n+"th number of Fibonacci Series recursive is: "+fibn(n));
    }

    public static int fibi(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (n > 1) {
            c=a+b; // a=0, b=1, c=1 ;a=1, b=1, c=2 ;a=1, b=2, c=3 ;
            a=b;
            b=c;
            n--;
        }
        return c;
    }

    public static int fibn(int n) {
        if (n == 0 || n ==1) {
            return n;
        }
        if (n < 0) {
            return -1;
        }
        return fibn(n-1) + fibn(n - 2);
    }
}
