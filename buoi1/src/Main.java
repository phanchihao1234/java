import onTap_oop.DanhSachFan;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int inputNumber(String name) {
        Scanner scan = new Scanner(System.in);
        boolean validInput = false;
        int value = 0;
        while (!validInput) {
            try {
                System.out.printf("%s cua ban: ", name);
                value = scan.nextInt();
                scan.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Loi~ roi nhap lai di, can nhap 1 so nguyen!!!");
                scan.next();
            }
        }
        return value;
    }

    public static void nhapXuat() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ten cua ban: ");
        String name = scan.nextLine();
        int age = 0;
        int height = 0;
        age = inputNumber("tuoi");
        height = inputNumber("chieu cao");
        System.out.println("Ten la " + name);
        System.out.println("Tuoi la " + age);
        System.out.println("Chieu cao la " + height);

        scan.close();
    }

    public static void cung() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngsinh: ");
        String input = sc.nextLine();
        LocalDate a = LocalDate.parse(input);
        System.out.println("Ngay sinh cua ban la: " + a);
    }

    public static void main(String[] args) {
//        cung();
//        nhapXuat();
//        HinhChuNhat a = new HinhChuNhat(4, 5);
//        System.out.println("DAI: " + a.dai);
//        System.out.println("ROMG: " + a.rong);
//        System.out.println("Chu vi hcm: " + a.chuVi());
//        System.out.println("Dien tich hcm: " + a.dienTich());

//        SinhVien a = new SinhVien();
//        SinhVien b = new SinhVien("Chi Hao", 7, 5);
//        SinhVien c = new SinhVien();
//        c.setTen("Bao");
//        c.setToan(7);
//        c.setVan(7);
//        c.xuat();
//        System.out.println("DTB: " + a.dtb());
//        System.out.println("DTB 2 sv: " + a.dtb(b));
//        System.out.println("DTB 3 sv: " + a.dtb(a, b));

//        SinhVienVN sVN = new SinhVienVN();
//        sVN.xuat();
//        sVN.nguNhieu();
//        SinhVienVN sNN = new SinhVienVN();
//        sNN.nguNhieu();


//        DanhSachDocGia d = new DanhSachDocGia();
//        d.nhap();
//        d.xuat();
//        System.out.println("Tong tien: " + d.tongTien());
//        System.out.println("Sl doc gia tre em: " + d.soLuong_DocGiaTreEm());

        DanhSachFan f = new DanhSachFan();
        f.nhap();
        f.xuat();
        System.out.println("Tong tien: " + f.tongTien());
        System.out.println("Sl Fan nguoi lon: " + f.demFanNgLon());
    }
}