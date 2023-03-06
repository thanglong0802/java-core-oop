package basic;

public class Bai10 {
//    Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn cả 3 điều kiện sau:
//    Là số nguyên tố.
//    Tất cả các chữ số là nguyên tố.
//    Đảo của nó cũng là một số nguyên tố.
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 1000000; i <= 9999999; i++) {
            if (kiemTraSoNguyenTo(i) && kiemTraChuSoNguyenToVaThuanNghich(i)) {
                count++;
                System.out.println(i);
            }
            i = i + test(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Tổng " + count + " số và thời gian " + (end - start) + " ms");
    }

    private static int test(int n) {
        if (n % 10 == 2) {
            return 0;
        } else if (n % 10 == 7) {
            return 4;
        } else
            return 1;
    }

    private static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean kiemTraChuSoNguyenToVaThuanNghich(int n) {
        int nInput = n;
        int reverse = 0;
        while (n > 0) {
            int lastNumber = n % 10;
            if (kiemTraSoNguyenTo(lastNumber)) {
                reverse = (reverse * 10) + lastNumber;
            } else {
                return false;
            }
            n /= 10;
        }
        if (reverse != nInput) {
            return false;
        }
        return true;
    }
}
