import java.util.ArrayList;

public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162};
        int cnt = countInversions(arr);
        System.out.println(cnt);
    }

    public static int countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;

        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += merge(arr, low, high, mid);
        return cnt;
    }

    public static int merge(int[] arr, int low, int high, int mid) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> tmp = new ArrayList<>();

        int cnt = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tmp.add(arr[left]);
                left++;
            } else {
                cnt += (mid - left + 1);
                tmp.add(arr[right]);
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

        return cnt;
    }
}
