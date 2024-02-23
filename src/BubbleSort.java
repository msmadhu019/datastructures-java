import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int sorted = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    sorted = 1;
                }
            }
            System.out.println(sorted);
            if (sorted == 0) {
                break;
            }
        }
    }
}
