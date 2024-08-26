package nhommau;

import java.util.Scanner;

public abstract class NhomMau {
    protected boolean rh;
    protected int loaiMau;
    public static final int _O=1;
    public static final int _A=2;
    public static final int _B=3;
    public static final int _AB=4;
    public NhomMau(){}
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap RH: ");
        this.rh = sc.nextBoolean();
    }
    public void xuat(){
        System.out.println("------------------");
        if(loaiMau==_O){
            System.out.print("O");
        } else if (loaiMau==_A) {
            System.out.print("A");
        } else if (loaiMau==_B) {
            System.out.print("B");
        } else if (loaiMau==_AB) {
            System.out.print("AB");
        }
        if(rh==false){
            System.out.println("-");
        }else {
            System.out.println("+");
        }
//        System.out.println("------------------");
    }
    public abstract boolean kiemTraDiTruyen(NhomMau cha,NhomMau con);
    public abstract boolean kiemTraNhomMau(NhomMau nhan);
    public boolean kiemTraRh(NhomMau nhan){
        if(this.rh == true){
            if(nhan.rh == true){
                return true;
            }
        }else if(this.rh == false){
            return true;
        }
        return false;
    }
    public boolean kiemTraChoNhan(NhomMau nhan){
        boolean nhomMau = kiemTraNhomMau(nhan);
        boolean rh = this.kiemTraRh(nhan);
        if(nhomMau && rh){
            return true;
        }else {
            return false;
        }
    }
    public boolean isRh() {
        return rh;
    }

    public void setRh(boolean rh) {
        this.rh = rh;
    }

    public int getLoaiMau() {
        return loaiMau;
    }

    public void setLoaiMau(int loaiMau) {
        this.loaiMau = loaiMau;
    }
}
