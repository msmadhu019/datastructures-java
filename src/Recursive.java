public class Recursive {
    public static void main(String[] args) {
        double res = result(-41);
        double res1 = result1(10);
        if (res < 1) {
            System.out.println("Invalid Number Provided for Factorial");
        } else {
            System.out.println("Result using Recursive Program: " + res);
        }
        System.out.println("Result without using Recursive Program: " + res1);
    }

    static double result1(int n) {
        double sum = n;
        while (n > 1) {
            sum = sum * (n - 1);
//            System.out.println(sum);
            n--;
        }
        return sum;
    }

    static double result(int n) {
        if (n == 1) {
            return 1;
        } else if (n < 1) {
            return (-1);
        } else {
            return n * result(n - 1);
        }
    }
}
