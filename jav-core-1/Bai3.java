import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        int b = scanner.nextInt();
        if (checkInput(a, b)) {
            System.out.println("WCLN: " + timUCLN(a, b));
            System.out.println("BCNN: " + timBCNN(a, b));
        }
    }

    public static boolean checkInput(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Nhập số nguyên dương");
            return false;
        }
        return true;
    }

    public static int soSanh(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static int timUCLN(int a, int b) {
        int max = 0;
        int min = soSanh(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        return max;
    }

    public static int timBCNN(int a, int b) {
        return (a * b) / timUCLN(a, b);
    }
}
