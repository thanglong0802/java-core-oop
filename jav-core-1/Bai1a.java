import java.util.Scanner;

public class Bai1a {
    public static void main(String[] args) {
        int result = tinhTong();
        System.out.println(result);
    }
    public static int tinhTong() {
        int tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
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
