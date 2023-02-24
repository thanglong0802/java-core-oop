import java.util.Scanner;

public class Bai1b {
    public static void main(String[] args) {
        float result = tinhTongPhanSo();
        System.out.println(result);
    }

    public static float tinhTongPhanSo() {
        float tong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            tong += (float) 1 / i;
            System.out.println(i + ": " + tong);
        }
        return tong;
    }
}
