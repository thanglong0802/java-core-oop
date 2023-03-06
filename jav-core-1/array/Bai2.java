package array;

import java.util.Arrays;

public class Bai2 {
//    Nhập mảng (a, n) và sắp xếp theo thứ tự tăng dần.
    public static void main(String[] args) {
        sapXepTangDan(new int[]{1, 3, 5, 4});
    }

    private static void sapXepTangDan(int[] arr) {
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            boolean isChange = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    isChange = true;
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
            if (isChange == false) {
                break;
            }
        }
    }
}
