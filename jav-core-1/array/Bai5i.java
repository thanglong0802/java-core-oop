package array;

import java.util.Scanner;

public class Bai5i {
    public static void main(String[] args) {
        int[] a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = scanner.nextInt();
        System.out.println("nhap x: ");
        int x = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap a[" + (i + 1) + "]= ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(!checkSNT(a[i])) {
                a[i] = 0;
            }
        }
        int kc = Integer.MAX_VALUE;
        int vitri = -1;
        for (int i = 0; i < n; i++) {
            if(a[i] != 0 && kc > (Math.abs(a[i]-x))) {
                kc = Math.abs(a[i]-x);
                vitri = i;
            }
        }
        System.out.println(vitri);
    }

    private static boolean checkSNT(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
