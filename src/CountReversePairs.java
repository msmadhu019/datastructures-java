import java.util.ArrayList;

public class CountReversePairs {
    public static void main(String[] args) {
        int[] arr = {2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
        int res = mergeSort(arr, 0, arr.length - 1);
        System.out.println(res);
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;

        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);

        return cnt;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> tmp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp.add(arr[left]);
                left++;
            } else {
                tmp.add(right);
                right++;
            }
        }
        while (left <= mid) {
            tmp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            tmp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = tmp.get(i - low);
        }
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int cnt = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {

            while (right <= high && (long) arr[i] > (long) 2 * arr[right]) {
                right++;
            }
            cnt += right - (mid + 1);
        }
        return cnt;
    }
}
