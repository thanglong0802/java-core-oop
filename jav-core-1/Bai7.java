
public class Bai7 {
//    Viết chương trình liệt kê các số nguyên tố có 6 chữ số chỉ bao gồm các chữ số lẻ.
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[1000000];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 100001; i < 999999; i += 2) {
            if (isPrime[i] && kiemTraSoLe(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean kiemTraSoLe(int n) {
        while (n > 0) {
            int soDu = n % 10;
            if (soDu % 2 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
