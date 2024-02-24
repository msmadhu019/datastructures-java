import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    public static void main(String[] args) {
        int[] arr = {3, 8, 7, 6, 5};
        int longest = longestSequence(arr);
        System.out.println(longest);
    }

    public static int longestSequence(int[] arr) {
        int longest = 0;
        int n = arr.length;
        Set<Integer> tmp = new HashSet<>();
        for (int i = 0; i < n; i++) {
            tmp.add(arr[i]);
        }

        for (int x : tmp) {
            if (!tmp.contains(x - 1)) {
                int cnt = 1;
                int y = x;
                while (tmp.contains(y + 1)) {
                    cnt++;
                    y = y + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }
}
