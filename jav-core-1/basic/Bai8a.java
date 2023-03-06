package basic;

public class Bai8a {
//    Viết chương trình liệt kê tất cả các số thuận nghịch có sáu chữ số (số thuận nghịch là số đối
//    xứng nhau, ví dụ 123321, 9512159, ...).
    public static void main(String[] args) {
        System.out.println("Số nghịch đảo có 6 chữ số trong đoạn [100001, 999999] là: ");
        int count = 0;
        for (int i = 100001; i <= 999999; i++) {
            if (kiemTraSoThuanNghich(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTổng có " + count + " số đối xứng");
    }

    private static boolean kiemTraSoThuanNghich(int n) {
        int nInput = n;
        int reverse = 0;
        while (n > 0) {
            int lastNumber = n % 10;
            reverse = (reverse * 10) + lastNumber;
            n /= 10;
        }
        if (reverse == nInput) {
            return true;
        } else {
            return false;
        }
    }
}
