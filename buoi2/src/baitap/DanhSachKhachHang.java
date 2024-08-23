package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachKhachHang {
    private List<KhachHang> arr;

    public DanhSachKhachHang() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        int flag = 1;
        System.out.println("1: Premium");
        System.out.println("2: NonMember");
        System.out.println("3: Basic");
        System.out.println("!12: exit");
        System.out.println("-----------------------");
        while (true) {
            System.out.println("Ban muon dang ky goi nao: ");
            Scanner sc = new Scanner(System.in);
            flag = sc.nextInt();
            KhachHang d;
            if (flag == 1) {
                d = new Premium();
            } else if (flag == 2) {
                d = new NonMember();
            }else if (flag == 3) {
                d = new Basic();
            } else {
                break;
            }
            d.nhap();
            arr.add(d);
        }
    }

    public void xuat() {
        for (KhachHang d : this.arr) {
            d.xuat();
        }
    }
}
