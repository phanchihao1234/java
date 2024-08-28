package ontap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    private List<Nguoi> arr;
    public DanhSach(){
        arr= new ArrayList<>();
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        int soLuong=0;
        System.out.println("Moi so luong khach hang: ");
        soLuong = sc.nextInt();
        for(int i=0;i<soLuong;i++){
            Nguoi a = new Nguoi();
            a.nhap();
            arr.add(a);
        }
    }
    public void  xuat(){
        for(Nguoi a : this.arr){
            a.xuat();

        }
    }
    public static void main(String[] args) {
        DanhSach ds =new DanhSach();
        ds.nhap();
        ds.xuat();
    }
}
