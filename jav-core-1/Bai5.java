import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
        System.out.println(tinhTongCacSo(n));
    }

    public static int tinhTongCacSo(int n) {
        int tong = 0;
        while (n > 0) {
            int tachSo = n % 10;
            n /= 10;
            tong += tachSo;
        }
        return tong;
    }
}
