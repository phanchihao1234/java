package suabai;

import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private String CMND;
    private int thang;
        private GoiDV dichvu;
    public KhachHang(){}
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        this.hoTen=sc.nextLine();
        System.out.println("Nhap so CCCD: ");
        this.CMND=sc.nextLine();
        System.out.println("Nhap so thang: ");
        this.thang=sc.nextInt();

        int flag=1;
        System.out.println("1: Premium");
        System.out.println("2: NonMember");
        System.out.println("3: Basic");
        System.out.println("!12: exit");
        System.out.println("-----------------------");
        flag = sc.nextInt();
        if(flag==1){
            this.dichvu =new Premium();
        }else if (flag==2){
            this.dichvu= new NonMember();
        } else if (flag==3) {
            System.out.println("Nhap so sl lop: ");
            int solop = sc.nextInt();
            this.dichvu= new Basic(solop);
        }
    }
    public void xuat(){
        System.out.println("Ho ten: " + this.hoTen +"---CMND: " +this.CMND +"---So thang dang ky: " + this.thang);
        System.out.println("Goi dich vu: "+this.dichvu);
//        System.out.println("Phi co ban: "+this.phiCoBan+"---Dich vu: "+this.dichVu+"---Chi phi lop hoc: "+this.chiPhiLopHoc+"---PT: "+this.pt );
    }
    public Long tinhTien(){
        return dichvu.tinhTien() * this.thang;
    }

}
