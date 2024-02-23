import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 8, 9, 11, 23, 10, 6};
        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quick_sort(arr, low, pIndex - 1);
            quick_sort(arr, pIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pIndex = arr[low];

        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pIndex && i <= high-1) {
                i++;
            }
            while (arr[j] > pIndex && j >= low+1) {
                j--;
            }
            if(i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[j];
        arr[j] = arr[low];
        arr[low] = tmp;

        return j;
    }
}
