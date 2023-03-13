package oopquanlythuvien;

public class MuonSach {
    private Sach sach;
    private int soLuong;

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "MuonSach{" +
                "sach=" + sach +
                ", soLuong=" + soLuong +
                '}';
    }
}
