package onTap_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachFan {
    private List<Fan> arrFan;

    public DanhSachFan() {
        this.arrFan = new ArrayList<>();
    }

    public void nhap() {
        int flag = 1;
        System.out.println("1: Nhap fan tre em");
        System.out.println("2: Nhap fan nguoi lon");
        System.out.println("!12: exit");
        System.out.println("-----------------------");
        while (true) {
            System.out.println("nhap lua chon: ");
            Scanner sc = new Scanner(System.in);
            flag = sc.nextInt();
            Fan f;
            if (flag == 1) {
                f = new Fan_TreEm();
            } else if (flag == 2) {
                f = new Fan_NguoiLon();
            } else {
                break;
            }
            f.nhap();
            arrFan.add(f);
        }
    }

    public void xuat() {
        for (Fan f : this.arrFan) {
            f.xuat();
        }
    }

    public int tongTien() {
        int sum = 0;
        for (Fan f : this.arrFan) {
            sum += f.tong();
        }
        return sum;
    }

    public int demFanNgLon() {
        int dem = 0;
        for (Fan f : this.arrFan) {
            if (f instanceof Fan_NguoiLon) {
                dem++;
            }
        }
        return dem;
    }
}
