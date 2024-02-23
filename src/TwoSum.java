import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 1};
        int target = 17;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("YES");
                System.exit(0);
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("NO");
    }
}
