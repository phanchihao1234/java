package baiTap_listDocGia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachDocGia {
    private List<DocGia> arr;

    public DanhSachDocGia() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        int flag = 1;
        System.out.println("1: Nhap tre em");
        System.out.println("2: Nhap nguoi lon");
        System.out.println("!12: exit");
        System.out.println("-----------------------");
        while (true) {
            System.out.println("nhap lua chon: ");
            Scanner sc = new Scanner(System.in);
            flag = sc.nextInt();
            DocGia d;
            if (flag == 1) {
                d = new DocGia_TreEm();
            } else if (flag == 2) {
                d = new DocGia_NgLon();
            } else {
                break;
            }
            d.nhap();
            arr.add(d);
        }
    }

    public void xuat() {
        for (DocGia d : this.arr) {
            d.xuat();
        }
    }

    public int soLuong_DocGiaTreEm() {
        int dem = 0;
        for (DocGia d : this.arr) {
            if (d instanceof DocGia_TreEm) {
                dem++;
            }
        }
        return dem;
    }

    public long tongTien() {
        long tong = 0;
        for (DocGia d : this.arr) {
            tong += d.tinhTien();
        }
        return tong;
    }
}
