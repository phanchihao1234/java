package baitap;

public class NonMember extends GoiDV{
    public NonMember() {
        this.setPhiCoBan(200);
        this.setDichVu("kh co");
        this.setChiPhiLopHoc("kh co");
        this.setPt("200");
    }
    public void nhap(){
        super.nhap();
    }
    public void xuat(){
        System.out.println("NonMember");
        System.out.println("Phi co ban: "+this.getPhiCoBan()+"---Dich vu: "+this.getDichVu()+"---Chi phi lop hoc: "+this.getChiPhiLopHoc()+"---PT: "+this.getPt() );
        super.xuat();
    }
}
