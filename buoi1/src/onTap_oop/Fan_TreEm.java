package onTap_oop;

import java.util.Scanner;

public class Fan_TreEm extends Fan {
    private String ten_NBH;

    public Fan_TreEm() {
        this.setGia(5000);
    }

    public String getTen_NBH() {
        return ten_NBH;
    }

    public void setTen_NBH(String ten_NBH) {
        this.ten_NBH = ten_NBH;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nguoi bao ho:");
        this.ten_NBH = sc.nextLine();
        super.nhap();
    }

    public void xuat() {

        System.out.println("Ten nguoi bao ho: " + ten_NBH);
        super.xuat();
    }

    @Override
    public long tong() {
        return getGia() * getSoThang();
    }


}
