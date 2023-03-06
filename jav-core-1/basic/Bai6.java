package basic;

import java.util.Scanner;

public class Bai6 {
//    Nhập vào một số nguyên từ bàn phím, viết chương trình phân tích số đó thành các
//    thừa số nguyên tố. Ví dụ: 28=2x2x7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
        getList(n);
    }
    private static void getList(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
                i = 1;
            }
        }
    }

}
