import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int n = scanner.nextInt();
        getList(n);
    }
    public static void getList(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                n = n / i;
                i = 1;
            }
        }
    }

}
