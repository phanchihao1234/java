package nhommau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DS_Nguoi_Hien_Mau {
    private List<NhomMau> arr;

    public DS_Nguoi_Hien_Mau() {
        arr = new ArrayList<>();
    }

    public List<NhomMau> getArr() {
        return arr;
    }

    public void setArr(List<NhomMau> arr) {
        this.arr = arr;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nguoi hien mau: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nguoi thu " + (i + 1));
            System.out.println("1. nhom mau O");
            System.out.println("2. nhom mau A");
            System.out.println("3. nhom mau B");
            System.out.println("4. nhom mau AB");
            int flag = sc.nextInt();
            if (flag == 1) {
                NhomMau a = new O();
                a.nhap();
                this.arr.add(a);
            } else if (flag == 2) {
                NhomMau a = new A();
                a.nhap();
                this.arr.add(a);
            } else if (flag == 3) {
                NhomMau a = new B();
                a.nhap();
                this.arr.add(a);
            } else if (flag == 4) {
                NhomMau a = new AB();
                a.nhap();
                this.arr.add(a);
            }
        }
    }

    public void xuat() {
        for (NhomMau a : this.arr) {
            a.xuat();
        }
    }

    public void cau2() {
        NhomMau me = new A();
        NhomMau cha = new B();
        NhomMau con = new A();
        if (me.kiemTraDiTruyen(cha, con)) {
            System.out.println("Gia dinh hanh phuc");
        } else {
            System.out.println("Lum theng` nay o thung rac a`");
        }
    }

    public void cau3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban cho 1 ng de nhan mau");
        int index = sc.nextInt();
        for (var i = 0; i < arr.size(); i++) {
            if (i != index) {
                if (this.arr.get(i).kiemTraChoNhan(this.arr.get(index))) {
                    System.out.printf("Ban thu %d co the cho mau ban thu %d \n", i, index);
                }
            }
        }
    }

    public static void main(String[] args) {
        DS_Nguoi_Hien_Mau ds = new DS_Nguoi_Hien_Mau();
        ds.nhap();
        ds.xuat();
//        ds.cau2();
        ds.cau3();
    }
}
