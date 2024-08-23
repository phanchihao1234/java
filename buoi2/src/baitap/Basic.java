package baitap;

public class Basic extends GoiDV{
    public Basic(){
        this.setPhiCoBan(500);
        this.setDichVu("kh co");
        this.setChiPhiLopHoc("100/lop");
        this.setPt("100");
    }
    public void nhap(){
        super.nhap();
    }
    public void xuat(){
        System.out.println("Basic");
        System.out.println("Phi co ban: "+this.getPhiCoBan()+"---Dich vu: "+this.getDichVu()+"---Chi phi lop hoc: "+this.getChiPhiLopHoc()+"---PT: "+this.getPt() );
        super.xuat();
    }
}
