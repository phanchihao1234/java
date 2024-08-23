package baiTap_listDocGia;

import java.util.Scanner;

public class DocGia_NgLon extends DocGia {
    private String So_CCCD;

    public DocGia_NgLon() {
        this.setGia(10000);
    }

    public String getSo_CCCD() {
        return So_CCCD;
    }

    public void setSo_CCCD(String so_CCCD) {
        So_CCCD = so_CCCD;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so CCCD: ");
        this.So_CCCD = sc.nextLine();
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So can cuoc cong dan: " + this.So_CCCD);
    }

    @Override
    public long tinhTien() {
        return getGia() * getSoThang();
    }

}
