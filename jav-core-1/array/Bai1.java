package array;

import java.util.Scanner;

public class Bai1 {
//    Nhập mảng (a, n) và kiểm tra mảng a có phải là mảng đối xứng hay không. Ví dụ: [15 2 1 2 15] là
//    mảng đối xứng.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println(kiemTraMangDoiXung(arr));
    }

    private static String kiemTraMangDoiXung(int[] arr) {
        for (int i = 0; i <= (arr.length) / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return "Khong phai mang doi xung";
            }
        }
        return "La mang doi xung";
    }
}
