import java.util.Scanner;

public class Bai5 {
//    Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ nhập vào từ bàn phím. Ví
//    dụ: Số 8545604 có tổng các chữ số là: 8 + 5 + 4 + 5 + 6 + 0 + 4 = 32.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
        System.out.println(tinhTongCacSo(n));
    }

    private static int tinhTongCacSo(int n) {
        int tong = 0;
        while (n > 0) {
            int tachSo = n % 10;
            n /= 10;
            tong += tachSo;
        }
        return tong;
    }
}
