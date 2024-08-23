package baiTap_listDocGia;

import java.util.Scanner;

public class DocGia_TreEm extends DocGia {
    private String ten_NBH;

    public DocGia_TreEm() {
        this.setGia(5000);
    }

    public String getTen_NBH() {
        return ten_NBH;
    }

    public void setTen_NBH(String ten_NBH) {
        this.ten_NBH = ten_NBH;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nguoi bao ho: ");
        this.ten_NBH = sc.nextLine();
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ten nguoi bao ho: " + this.ten_NBH);
    }

    @Override
    public long tinhTien() {
        return getGia() * getSoThang();
    }
}
