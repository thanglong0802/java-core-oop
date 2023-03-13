package oopquanlythuvien;

import java.util.Scanner;

public class BanDoc extends Person {
    private static final String SINH_VIEN = "Sinh viên";
    private static final String HOC_VIEN_CAO_HOC = "Học viên cao học";
    private static final String GIAO_VIEN = "Giáo viên";
    private static int ID_AUTO = 10000;
    private String loaiBanDoc;

    public BanDoc() {
        this.maBanDoc = ID_AUTO++;
    }

    public BanDoc(String hoTen, String diaChi, int soDienThoai, String loaiBanDoc) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.loaiBanDoc = loaiBanDoc;
    }

    public String getLoaiBanDoc() {
        return loaiBanDoc;
    }

    public void setLoaiBanDoc(String loaiBanDoc) {
        this.loaiBanDoc = loaiBanDoc;
    }

    public void nhapBanDoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn đọc: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        soDienThoai = scanner.nextInt();
        System.out.println("Nhập loại bạn đọc: ");
        System.out.println("1. Sinh viên");
        System.out.println("2. Học viên cao học");
        System.out.println("3. Giáo viên");
        int type = 0;
        do {
            type = scanner.nextInt();
            if (type >= 1 && type <= 3) {
                break;
            } else {
                System.out.println("Nhập lại");
            }
        } while (type < 1 || type > 3);
        switch (type) {
            case 1:
                loaiBanDoc = SINH_VIEN;
                break;
            case 2:
                loaiBanDoc = HOC_VIEN_CAO_HOC;
                break;
            case 3:
                loaiBanDoc = GIAO_VIEN;
                break;
        }
    }

    @Override
    public String toString() {
        return "BanDoc{" +
                "maBanDoc=" + maBanDoc +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                ", loaiBanDoc='" + loaiBanDoc + '\'' +
                '}';
    }
}
