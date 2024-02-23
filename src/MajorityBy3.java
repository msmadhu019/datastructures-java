import java.util.ArrayList;

public class MajorityBy3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3};
        ArrayList<Integer> res = majority(arr, arr.length);
        System.out.println(res);
    }

    public static ArrayList<Integer> majority(int[] arr, int len) {
        ArrayList<Integer> res = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = -1;
        int ele2 = -1;

        for (int i = 0; i < len; i++) {
            if (cnt1 == 0 && arr[i] != ele2) {
                ele1 = arr[i];
                cnt1++;
            } else if (cnt2 == 0 && arr[i] != ele1) {
                ele2 = arr[i];
                cnt2++;
            } else if (arr[i] == ele1) {
                cnt1++;
            } else if (ele2 == arr[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        int cnt11 = 0;
        int cnt22 = 0;
        for (int i = 0; i < len; i++) {
            if (ele1 == arr[i]) {
                cnt11++;
            } else if (ele2 == arr[i]) {
                cnt22++;
            }
        }
        if (cnt11 > len / 3) res.add(ele1);
        if (cnt22 > len / 3) res.add(ele2);
        return res;
    }
}
