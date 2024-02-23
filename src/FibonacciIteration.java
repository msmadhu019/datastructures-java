public class FibonacciIteration {
    public static void main(String[] args) {
        int n = 19;
        int count = 0;
        int prev = 0;
        int curr = 1;
        int next = 0;
        while (count < n) {
            next = prev + curr;
            prev = curr;
            curr = next;
            count++;
        }
        System.out.println(next);
    }

}
