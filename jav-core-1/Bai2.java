import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        timUoc();
    }

    public static void timUoc() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int count = 0;
        do {
            System.out.println("Input >= 1: ");
            n = scanner.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                count++;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n" + n + " có " + count + " ước");
    }
}
