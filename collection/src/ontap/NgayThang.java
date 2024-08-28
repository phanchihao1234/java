package ontap;

import java.util.Scanner;

public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;
    public NgayThang(){

    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public void nhapNgayThang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        this.ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        this.thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        this.nam = sc.nextInt();
    }
    public void xuatNgayThang(){
        System.out.println("Ngay sinh: " +this.ngay+ "-"+this.thang+"-"+this.nam);

    }
}
