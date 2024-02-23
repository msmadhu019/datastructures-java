import java.util.HashMap;

public class FibonacciHashMap {
    public static void main(String[] args) {
        int n = 19;
        int sum = 0;
        sum = addNum(n);
        System.out.println(sum);
    }

    public static int addNum(int n) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);

        if (!map.containsKey(n)) {
            map.put(n, addNum(n - 1) + addNum(n - 2));
        }
        return map.get(n);
    }

}
