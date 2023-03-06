package basic;

import java.util.Scanner;

public class Bai1b {
//    Nhập số tự nhiên n từ bàn phím rồi tính tổng (lưu ý phép chia các số nguyên): 1 + 1/2 + ... + 1/n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
        float result = tinhTongPhanSo(n);
        System.out.println(result);
    }

    private static float tinhTongPhanSo(int n) {
        float tong = 0;
        for (int i = 1; i <= n ; i++) {
            tong += (float) 1 / i;
            System.out.println(i + ": " + tong);
        }
        return tong;
    }
}
