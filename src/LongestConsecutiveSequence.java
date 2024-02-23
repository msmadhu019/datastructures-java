import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int res = longest(arr, arr.length);
        System.out.println(res);
    }

    public static int longest(int[] arr, int n) {
        Set<Integer> tmp = new HashSet<>();
        int longest = 1;
        for (int i = 0; i < n; i++) {
            tmp.add(arr[i]);
        }
        for (int val : tmp) {
            if (!tmp.contains(val - 1)) {
                int cnt = 1;
                int x = val;
                while (tmp.contains(x + 1)) {
                    cnt++;
                    x = x + 1;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
}
