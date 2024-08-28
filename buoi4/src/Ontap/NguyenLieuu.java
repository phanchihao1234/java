package Ontap;

import java.util.Scanner;

public class NguyenLieuu {
    protected int carb;
    protected int fat;
    protected int fatBaoHoa;
    protected int protein;
    protected int calo;
    protected String thucPham;
    protected int khoiLuong;

    public NguyenLieuu() {

    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khoi luong nguyen lieu: ");
        this.khoiLuong = sc.nextInt();
    }
}
