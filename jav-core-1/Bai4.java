public class Bai4 {
//    Viết chương trình in ra các cặp số nguyên tố cùng nhau trong đoạn [a,b]. Với a,b nhập từ
//    bàn phím.
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 17};
        capSoNguyenTo(a);
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

    private static void capSoNguyenTo(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (kiemTraSoNguyenTo(a[i]) && kiemTraSoNguyenTo(a[i + 1])) {
                System.out.println(a[i] + " - " + a[i + 1]);
            }
        }
    }
}
