package oopquanlythuvien;

import java.util.Arrays;

public class QuanLyMuonSach {
    BanDoc banDoc;
    Sach[] saches;

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public Sach[] getSaches() {
        return saches;
    }

    public void setSaches(Sach[] saches) {
        this.saches = saches;
    }

    @Override
    public String toString() {
        return "QuanLyMuon{" +
                "banDoc=" + banDoc +
                ", saches=" + Arrays.toString(saches) +
                '}';
    }
}
