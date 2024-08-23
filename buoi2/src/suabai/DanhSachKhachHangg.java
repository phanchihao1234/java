package suabai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachKhachHangg {
    private List<KhachHang> arr;
    public DanhSachKhachHangg(){
        arr= new ArrayList<>();
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        int soLuong=0;
        System.out.println("Moi so luong khach hang: ");
        soLuong = sc.nextInt();
        for(int i=0;i<soLuong;i++){
            KhachHang a = new KhachHang();
            a.nhap();
            arr.add(a);
        }
    }
    public void  xuat(){
        for(KhachHang a : this.arr){
            a.xuat();
            System.out.println("Tinh tien: " + a.tinhTien());
        }
    }
    public Long maxTien(){
        Long max=0L;
        for (KhachHang a:this.arr){
            if(max<a.tinhTien()){
                max=a.tinhTien();
            }
        }
        return max;
    }
    public void cau4(){
        System.out.println("---------------");
        System.out.println("Danh sach khang hang max");
        Long maxTien=maxTien();
        for(KhachHang a : this.arr){
            Long kq =a.tinhTien();
            if(maxTien.equals(kq)){
                a.xuat();
            }
        }
    }

}
