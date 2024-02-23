public class TwoDigitSum {
    public static void main(String[] args) {
        int n=12191;
        if (n < 0) {
            System.out.println("Invalid positive integer");
        } else{
            System.out.println("The Sum of digits of "+n+" is: "+sumOfDigits(n));
        }
    }

    public static int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
