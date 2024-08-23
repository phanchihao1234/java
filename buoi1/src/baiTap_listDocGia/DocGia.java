package baiTap_listDocGia;

import java.util.Scanner;

public abstract class DocGia {
    private int soThang;
    private long gia;

    public DocGia() {

    }

    public DocGia(int soThang, long gia) {
        this.soThang = soThang;
        this.gia = gia;
    }

    public int getSoThang() {
        return soThang;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang: ");
        this.soThang = sc.nextInt();
    }

    public void xuat() {
        System.out.println("So thang: " + this.soThang + "   Gia: " + this.gia);
    }

    abstract long tinhTien();
}
