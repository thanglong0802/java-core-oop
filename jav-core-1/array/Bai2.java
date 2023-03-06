package array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
//    Nhập mảng (a, n) và sắp xếp theo thứ tự tăng dần.
    public static void main(String[] args) {
        int[] arr = NhapMang.nhapMang();
        sapXepTangDan(arr);
    }

    private static void sapXepTangDan(int[] arr) {
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
    }
}
