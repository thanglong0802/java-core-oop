package array;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
//    Nhập mảng (a, n) và nhập số X. Xác định vị trí của số nguyên tố trên a có giá trị gần với X nhất.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhap so X: ");
        int x = scanner.nextInt();
        int index = timSoNguyenToGanXNhat(arr, x);
        if (index == -1) {
            System.out.println("Khong tim thay so nguyen to trong mang.");
        } else {
            System.out.println("Vi tri cua so nguyen to gan X nhat: " + (index + 1));
        }
    }

    private static boolean isPrime(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static int timSoNguyenToGanXNhat(int[] arr, int x) {
        int length = arr.length;
        int max = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < length; i++) {
            if (isPrime(arr[i])) {
                int ganX = Math.abs(arr[i] - x);
                if (ganX < max) {
                    max = ganX;
                    index = i;
                }
            }
        }
        return index;
    }

    public static int findNearestPrimeIndexWithBinarySearch(int[] a, int n, int x) {
        // Sắp xếp mảng a theo thứ tự tăng dần
        Arrays.sort(a);
        // Sử dụng thuật toán tìm kiếm nhị phân để tìm vị trí của số nguyên tố gần nhất với số X
        int left = 0, right = n - 1, mid;
        int index = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (isPrime(a[mid])) {
                index = mid;
                break;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // Kiểm tra vị trí của số nguyên tố gần nhất và trả về kết quả
        if (index != -1) {
            return index;
        } else if (right < 0) {
            return 0;
        } else if (left >= n) {
            return n - 1;
        } else {
            int diffLeft = x - a[right];
            int diffRight = a[left] - x;
            if (diffLeft <= diffRight) {
                return right;
            } else {
                return left;
            }
        }
    }
}
