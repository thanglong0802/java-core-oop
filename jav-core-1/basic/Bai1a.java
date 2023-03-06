package basic;

import java.util.Scanner;

public class Bai1a {
//    Nhập số nguyên n vào từ bàn phím và viết chương trình tính tổng: n lẻ - tổng lẻ, n chẵn - tổng chẵn
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
        int result = tinhTong(n);
        System.out.println(result);
    }
    private static int tinhTong(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            if (kiemTraChanLe(n) == 1) {
                if (i % 2 == 0) {
                    tong += i;
                }
            } else {
                if (i % 2 != 0) {
                    tong += i;
                }
            }
        }
        return tong;
    }

    private static int kiemTraChanLe(int n) {
        int isCheck = 0;
        if(n % 2 == 0) {
            isCheck = 1;
        }
        return isCheck;
    }
}
