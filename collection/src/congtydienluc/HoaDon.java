package congtydienluc;

import java.util.Scanner;

public abstract class HoaDon {
    private String makh;
    private String tenkh;
    private int cscu;
    private int csmoi;
    public HoaDon(){};
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getCscu() {
        return cscu;
    }

    public void setCscu(int cscu) {
        this.cscu = cscu;
    }

    public int getCsmoi() {
        return csmoi;
    }

    public void setCsmoi(int csmoi) {
        this.csmoi = csmoi;
    }

    protected int soKWTieuThu(){
        return this.csmoi-this.cscu;
    }
    public abstract int tienDien();
    public abstract double tienThanhToan();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khang hang: ");
        this.makh = sc.nextLine();
        System.out.println("Nhap ten khang hang: ");
        this.tenkh = sc.nextLine();
        System.out.println("Nhap chi so cu~: ");
        this.cscu = sc.nextInt();
        do {
            System.out.println("Nhap chi so moi: ");
            this.csmoi = sc.nextInt();
        }
        while (csmoi<cscu);
//        System.out.println("Nhap chi so moi: ");
//        int tam=sc.nextInt();
//        if(tam>this.cscu){
//            this.csmoi = tam;
//        }else {
//            System.out.println("Nhap lai cs: ");
//
//        }
    }
    public void xuat(){
        System.out.println("#############################");
        System.out.println("Ma khach hang: "+ this.makh+" Ten khach hang: "+this.tenkh);
        System.out.println("Chi so cu: "+ this.cscu+ " Chi so moi: "+this.csmoi);
    }
}
