public class Bai8b {
//    Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví
//    dụ số: 721127).
    public static void main(String[] args) {
        for (int i = 100001; i <= 999999; i++) {
            if (kiemTraSoThuanNghich(i)) {
                System.out.println();
            }
        }
    }

    private static boolean kiemTraSoThuanNghich(int n) {
        int nInput = n;
        int reverse = 0;
        int sum = 0;
        while (n > 0) {
            int lastNumber = n % 10;
            reverse = (reverse * 10) + lastNumber;
            sum += lastNumber;
            n /= 10;
        }
        if (reverse == nInput && sum % 10 == 0) {
            System.out.println(nInput + " là số thuận nghịch và tổng chia hết cho 10, tổng = " + sum);
            return true;
        }
        return false;
    }
}
