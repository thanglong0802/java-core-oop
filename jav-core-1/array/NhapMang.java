package array;

import java.util.Scanner;

public class NhapMang {
    public static int[] nhapMang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
