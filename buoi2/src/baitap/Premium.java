package baitap;

public class Premium extends GoiDV {
    public Premium(){
        this.setPhiCoBan(1000);
        this.setDichVu("free");
        this.setChiPhiLopHoc("free");
        this.setPt("free");
    }
    public void nhap(){
        super.nhap();
    }
    public void xuat(){
        System.out.println("Premium");
        System.out.println("Phi co ban: "+this.getPhiCoBan()+"---Dich vu: "+this.getDichVu()+"---Chi phi lop hoc: "+this.getChiPhiLopHoc()+"---PT: "+this.getPt() );
        super.xuat();
    }
}
