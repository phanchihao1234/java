package cooking;

import java.util.Scanner;

public class NguyenLieu {
    protected int carb;
    protected int fat;
    protected int fatBaoHoa;
    protected int protein;
    protected int calo;
    protected String thucPham;
    protected int khoiLuong;
    public NguyenLieu(){

    }

    public int getCarb() {
        return carb;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getFatBaoHoa() {
        return fatBaoHoa;
    }

    public void setFatBaoHoa(int fatBaoHoa) {
        this.fatBaoHoa = fatBaoHoa;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCalo() {
        return calo;
    }

    public void setCalo(int calo) {
        this.calo = calo;
    }

    public String getThucPham() {
        return thucPham;
    }

    public void setThucPham(String thucPham) {
        this.thucPham = thucPham;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khoi Luong: ");
        this.khoiLuong = sc.nextInt();
    }
}
