package ontap;

import java.util.Scanner;

public class Nguoi {
    private String ten;
    private NgayThang ns;
    public Nguoi(){

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public NgayThang getNs() {
        return ns;
    }

    public void setNs(NgayThang ns) {
        this.ns = ns;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong ho ten: ");
        this.ten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ns =new NgayThang();
        this.ns.nhapNgayThang();
    }
    public void xuat(){
        System.out.println("Ho ten: "+ this.ten);
        System.out.println("Ngay sinh" + this.ns);
        this.ns.xuatNgayThang();
    }
}
