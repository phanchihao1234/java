package congtydienluc;

import java.util.Scanner;

public class HoKinhDoanh extends HoaDon {
    private Boolean thongTin;

    public HoKinhDoanh() {
        super();
    }

    @Override
    public int tienDien() {
        return super.soKWTieuThu() * 3000;
    }

    @Override
    public double tienThanhToan() {
        double s = 0.0;
        if (this.thongTin == true) {
            s = tienDien() + (0.1 * tienDien()) - (0.05 * tienDien());
        } else {
            s = tienDien() + (0.1 * tienDien());
        }
        return s;
    }

    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin linh vuc kinh doanh: ");
        System.out.println("1. Cong ty nha nuoc");
        System.out.println("2. Cong ty tu nhan");
        int f = sc.nextInt();
        if (f == 1) {
            this.thongTin = true;
        } else {
            this.thongTin = false;
        }

    }

    public void xuat() {
        super.xuat();
        System.out.println("Thong tin linh vuc kinh doanh: " + (this.thongTin?"cty nha nuoc":"cty tu nhan"));
        System.out.printf("Tien phai tra: %f \n", tienThanhToan());
    }

}
