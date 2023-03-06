package basic;

public class Bai9 {
//    Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn cả 3 điều kiện sau:
//    Là số thuận nghịch.
//    Chỉ có chữ số 0, 6, 8.
//    Tổng chữ số chia hết cho 10.
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 1000000; i <= 999999999; i++) {
            if (getList(i)) {
                count++;
                System.out.println(i);

            }
           i = i + test(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Tổng " + count + " số và thời gian " + (end - start) + " ms");
    }
    private static int test(int n) {
        if (n % 10 == 0) {
            return 5;
        } else {
            return 1;
        }
    }

    private static boolean getList(int n) {
        int nInput = n;
        int reverse = 0;
        int sum = 0;
        while (n > 0) {
            int lastNumber = n % 10;
            if (lastNumber == 0 || lastNumber == 6 || lastNumber == 8) {
                reverse = (reverse * 10) + lastNumber;
                sum += lastNumber;
            } else {
                return false;
            }
            n /= 10;
        }
        if (reverse == nInput && sum % 10 == 0) {
            System.out.println(nInput + " là số thuận nghịch và tổng chia hết cho 10, tổng = " + sum);
            return true;
        }
        return false;
    }
}
