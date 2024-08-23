package onTap_oop;

import java.util.Scanner;

public class Fan_NguoiLon extends Fan {
    private String CCCD;

    public Fan_NguoiLon() {
        this.setGia(10000);
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can cuoc cong dan:");
        this.CCCD = sc.nextLine();
        super.nhap();
    }

    public void xuat() {

        System.out.println("So can cuoc cong dan: " + CCCD);
        super.xuat();
    }

    @Override
    public long tong() {
        return getGia() * getSoThang();
    }

}
