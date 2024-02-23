import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 6, 7, 9};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && (arr[j - 1] > arr[j])) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }
        }
    }
}
