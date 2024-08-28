package congtydienluc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoaDon {
    private List<HoaDon> arr;

    public DanhSachHoaDon() {
        arr = new ArrayList<>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        int soLuong = 0;
        System.out.println("Nhap so luong hoa don: ");
        soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin hoa don " + (i + 1));
            System.out.println("1. Ho Binh Thuong");
            System.out.println("2. Ho Kinh Doanh");
            int flag = sc.nextInt();
            if (flag == 1) {
                HoaDon a = new HoBinhThuong();
                a.nhap();
                arr.add(a);
            } else if (flag == 2) {
                HoaDon a = new HoKinhDoanh();
                a.nhap();
                arr.add(a);
            }
        }
    }
    public void xuat() {
        for (HoaDon a : this.arr) {
            a.xuat();
        }
    }
    public void cau3(){
        System.out.println("Cau 3");
        double tongTienThanhToan = this.arr.stream()
                .mapToDouble(HoaDon::tienThanhToan).sum();
        System.out.println("tong tien cac ho use: "+tongTienThanhToan);
    }
    public int tinhSoKwNhieuNhat(){
        return this.arr.stream()
                .filter(k->k instanceof HoKinhDoanh)
                .mapToInt(HoaDon::soKWTieuThu)
                .max().getAsInt();
    }
    public void cau4(){
        //Cach 1
        System.out.println("cau 4");
        int maxKw=tinhSoKwNhieuNhat();
        for (HoaDon h : this.arr){
            if(h.soKWTieuThu() == maxKw && h instanceof HoKinhDoanh){
                System.out.println("Ma khang hang: " + h.getMakh() + "su dung dien nhieu nhat");
            }
        }
        //Cach 2
        this.arr.stream()
                .filter(k->k.soKWTieuThu()==maxKw&&k instanceof HoKinhDoanh)
                .forEach(k->{
                    System.out.println("Ma khang hang: " + k.getMakh()+"  -  "+k.getTenkh() + "su dung dien nhieu nhat");
                });
    }

    public double tongCacHo(){
        double tong=0;
        for (HoaDon a : this.arr) {
            tong+=a.tienThanhToan();
        }
        return tong;
    }



    public static void main(String[] args) {
        DanhSachHoaDon ds = new DanhSachHoaDon();
        ds.nhap();
        ds.xuat();
        System.out.printf("tong cac ho: %f",ds.tongCacHo());
        ds.cau3();
        ds.cau4();
    }
}
