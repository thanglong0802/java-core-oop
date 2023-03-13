package oopquanlythuvien;

import java.util.Scanner;

public class Sach {
    private static final String KHOA_HOC_TU_NHIEN = "Khoa học tự nhiên";
    private static final String VAN_HOC_CONG_NGHE = "Văn học - công nghệ";
    private static final String DIEN_TU_VIEN_THONG = "Điện tử viễn thông";
    private static final String CONG_NGHE_THONG_TIN = "Công nghệ thông tin";
    private static int ID_AUTO = 10000;
    private int maSach;
    private String tenSach;
    private String tacGia;
    private String chuyenNganh;
    private int namXuatBan;

    public Sach() {
        this.maSach = ID_AUTO++;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void nhapSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        tenSach = scanner.nextLine();
        System.out.println("Nhập tên tác giả: ");
        tacGia = scanner.nextLine();
        System.out.println("Nhập chuyên ngành: ");
        System.out.println("1. Khoa học tự nhiên");
        System.out.println("2. Văn học - công nghệ");
        System.out.println("3. Điện tử viễn thông");
        System.out.println("4. Công nghệ thông tin");
        int type = 0;
        do {
            type = scanner.nextInt();
            if (type >= 1 && type <= 4) {
                break;
            } else {
                System.out.println("Nhập lại");
            }
        } while (type < 1 || type > 4);
        switch (type) {
            case 1:
                chuyenNganh = KHOA_HOC_TU_NHIEN;
                break;
            case 2:
                chuyenNganh = VAN_HOC_CONG_NGHE;
                break;
            case 3:
                chuyenNganh = DIEN_TU_VIEN_THONG;
                break;
            case 4:
                chuyenNganh = CONG_NGHE_THONG_TIN;
                break;
        }
        System.out.println("Nhập năm xuất bản: ");
        namXuatBan = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
}
