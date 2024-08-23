package oop;

public class SinhVienVN extends SinhVien implements Nguoi {
    private float triet;

    public SinhVienVN() {
        super();
    }

    public SinhVienVN(float triet) {
        super();
        this.triet = triet;
    }

    public void xuat() {
        super.xuat();
        System.out.println("Triet hoc: " + triet);
    }

    @Override
    public void nguNhieu() {
        System.out.println("Ngu? nhieu qua day di!!!");
    }
}
