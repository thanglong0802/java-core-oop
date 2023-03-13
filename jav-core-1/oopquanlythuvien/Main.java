package oopquanlythuvien;

import java.util.Scanner;

public class Main extends BanDoc {
    private static Sach[] SACH_LIST = new Sach[50];
    private static int COUNT_S = 0;
    private static BanDoc[] BAN_DOC = new BanDoc[50];
    private static int COUNT_BD = 0;

    public static void main(String[] args) {
        BanDoc banDoc = new BanDoc();
        banDoc.setHoTen("Nguyễn Thăng Long");
        banDoc.setDiaChi("Hà Nam");
        banDoc.setSoDienThoai(9999);
        banDoc.setLoaiBanDoc("Sinh viên");
        BAN_DOC[COUNT_BD++] = banDoc;

//        Sach sach = new Sach();
//        sach.setTenSach("Sách giáo khoa Toán");
//        sach.setTacGia("Tác giả");
//        sach.setChuyenNganh("Khoa học tự nhiên");
//        sach.setNamXuatBan(2000);
//        SACH_LIST[COUNT_S++] = sach;

        menu();
    }
    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean isTop = true;
        while (isTop) {
            System.out.println("QUẢN LÝ MƯỢN SÁCH");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Thêm bạn đọc mới");
            System.out.println("4. Hiển thị danh sách bạn đọc");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng: ");
            int type = scanner.nextInt();
            switch (type) {
                case 0:
                    isTop = false;
                    break;
                case 1:
                    newBook();
                    break;
                case 2:
                    showBook();
                    break;
                case 3:
                    newBanDoc();
                    break;
                case 4:
                    showBanDoc();
                    break;
            }
        }
    }

    private static boolean coDuLieuBanDoc() {
        for (int i = 0; i < COUNT_BD; i++) {
            if (BAN_DOC[i] == null) {
                return false;
            }
        }
        return true;
    }

    private static boolean coDuLieuSach() {
        for (int i = 0; i < COUNT_S; i++) {
            if (SACH_LIST[i] == null) {
                return false;
            }
        }
        return true;
    }

    private static void showBanDoc() {
        for (int i = 0; i < COUNT_BD; i++) {
            if (coDuLieuBanDoc()) {
                System.out.println("Danh sách bạn đọc: " + BAN_DOC[i].toString());
            }
        }
        System.out.println("Chưa có dữ liệu");
    }

    private static void newBanDoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng bạn đọc mới: ");
        int newBanDoc = scanner.nextInt();
        for (int i = 0; i < newBanDoc; i++) {
            System.out.println("Thêm bạn đọc thứ " + (i + 1) + ": ");
            BanDoc banDoc = new BanDoc();
            banDoc.nhapBanDoc();
            BAN_DOC[COUNT_BD++] = banDoc;
        }
    }

    private static void showBook() {
        for (int i = 0; i < COUNT_S; i++) {
            if (coDuLieuSach()) {
                System.out.println("Danh sách Sách: " + SACH_LIST[i].toString());
            }
        }
        System.out.println("Chưa có dữ liệu");
    }

    private static void newBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách mới: ");
        int newBook = scanner.nextInt();
        for (int i = 0; i < newBook; i++) {
            System.out.println("Sách mới thứ " + (i + 1) + ": ");
            Sach sach = new Sach();
            sach.nhapSach();
            SACH_LIST[COUNT_S++] = sach;
        }
    }
}
