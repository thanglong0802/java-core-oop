package array;

public class Bai3 {
//    Nhập mảng (a, n) và đếm số lần xuất hiện của từng phần tử trong mảng, đồng thời cho biết phần tử có số
//    lần xuất hiện nhiều nhất trong a.
    public static void main(String[] args) {
        int[] arr = NhapMang.nhapMang();
        demSoLanXuatHienHashTable(arr);
        System.out.println("==================================");
        demSoLanXuatHienForLongFor(arr);
    }

    private static void demSoLanXuatHienHashTable(int[] arr) {
        int n = arr.length;
        int maxCount = 0;
        int maxElement = 0;
        int[] counts = new int[n];
        // Duyệt qua mảng và đếm số lần xuất hiện của từng phần tử
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            counts[element]++;
        }
        // Tìm phần tử có số lần xuất hiện nhiều nhất trong mảng
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            if (counts[i] > maxCount) {
                System.out.println(counts[i]);
                maxCount = counts[i];
                maxElement = i;
                System.out.println("max count: " + maxCount);
                System.out.println("i: " + i);
            }
        }
        // In ra số lần xuất hiện của từng phần tử trong mảng
        for (int i = 0; i < n; i++) {
            if (counts[i] > 0) {
                System.out.println(i + ": " + counts[i]);
            }
        }
        System.out.println("Max element: " + maxElement + " max count: " + maxCount);
    }

    private static void demSoLanXuatHienForLongFor(int[] arr) {
        int n = arr.length;
        int maxCount = 0;
        int maxElement = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        System.out.println("Max element: " + maxElement + " max count: " + maxCount);
    }
}
