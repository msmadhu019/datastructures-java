import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4};
        int target = 6;
        List<List<Integer>> ans = fourSum(arr, target);
        System.out.println(ans);
    }

    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        List<Integer> tmp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        Collections.sort(tmp);
                        ans.add(tmp);
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l - 1]) l--;
                    } else if (sum < target) {
                        k++;
                    } else l--;
                }
            }
        }
        return ans;
    }
}
