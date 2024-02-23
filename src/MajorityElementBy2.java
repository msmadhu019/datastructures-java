public class MajorityElementBy2 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 7, 7, 1, 1, 5, 1, 7, 1, 5, 1, 5, 7, 5, 7, 5, 5, 5, 5, 5};
        int res = majority(arr, arr.length);
        System.out.println(arr.length);
        System.out.println(res);
    }

    public static int majority(int[] arr, int len) {
        int cnt = 0;
        int el = -1;

        for (int i = 0; i < len; i++) {
            if (cnt == 0) {
                el = arr[i];
                cnt = 1;
            } else if (arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for (int i = 0; i < len; i++) {
            if (el == arr[i]) {
                cnt1++;
            }
        }
        System.out.println(cnt1);
        if (cnt1 > len / 2) {
            return el;
        }
        return -1;
    }
}
