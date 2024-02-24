import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "aaaaa";
        int len = longest_substring(s);
        System.out.println(len);
    }

    public static int longest_substring(String s) {
        int left = 0;
        int right = 0;
        int len = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        while (right < n) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(s.charAt(right) + 1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}
