package Ontap;

import cooking.Ga;
import cooking.HatSen;
import cooking.NguyenLieu;

import java.util.ArrayList;
import java.util.List;

public class MonEn {
    private List<NguyenLieuu> arr;
    public MonEn(){
        this.arr=new ArrayList<>();
    }
    public void nhap() {
        System.out.println("Moi ban nhap carot");
        NguyenLieuu cr = new CaRott();
        cr.nhap();
        this.arr.add(cr);
        System.out.println("Moi ban nhap Hat Sen");
        NguyenLieuu nam = new Nam();
        nam.nhap();
        this.arr.add(nam);

    }
    public static void main(String[] args) {
        MonEn a = new MonEn();
        a.nhap();
    }
}
