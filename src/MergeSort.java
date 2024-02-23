import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {9, 4, 7, 6, 3, 1, 5};
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, r, mid);

    }

    public static void merge(int[] arr, int l, int r, int mid) {
        int left = l;
        int right = mid + 1;
        ArrayList<Integer> tmp = new ArrayList<>();

        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                tmp.add(arr[left]);
                left++;
            } else {
                tmp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            tmp.add(arr[left]);
            left++;
        }
        while (right <= r) {
            tmp.add(arr[right]);
            right++;
        }

        for (int i = l; i < r; i++) {
            arr[i] = tmp.get(i - l);
        }
    }
}
