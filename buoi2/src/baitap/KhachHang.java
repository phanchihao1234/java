package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import baitap.GoiDV;

public class KhachHang {
    private String hoTen;
    private String CMND;
    private int thang;
    private List<GoiDV> a;

//    private GoiDV;
    public KhachHang(String hoTen, String CMND, int thang) {
        this.hoTen = hoTen;
        this.CMND = CMND;
        this.thang = thang;
        this.a = new ArrayList<>();
    }

    public KhachHang() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap so CMND");
        this.CMND = sc.nextLine();
        System.out.println("Nhap so thang: ");
        this.thang = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ho ten: " + this.hoTen +"---CMND: " +this.CMND +"---So thang dang ky: " + this.thang);
//        System.out.println("Phi co ban: "+this.phiCoBan+"---Dich vu: "+this.dichVu+"---Chi phi lop hoc: "+this.chiPhiLopHoc+"---PT: "+this.pt );
    }
}
