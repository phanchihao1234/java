package baitap;

public class GoiDV extends KhachHang{

    private long phiCoBan;
    private String chiPhiLopHoc;
    private String dichVu;
    private String pt;

    public  GoiDV(){}

    public GoiDV(long phiCoBan, String chiPhiLopHoc, String dichVu, String pt) {
        this.phiCoBan = phiCoBan;
        this.chiPhiLopHoc = chiPhiLopHoc;
        this.dichVu = dichVu;
        this.pt = pt;
    }

    public long getPhiCoBan() {
        return phiCoBan;
    }

    public void setPhiCoBan(long phiCoBan) {
        this.phiCoBan = phiCoBan;
    }

    public String getChiPhiLopHoc() {
        return chiPhiLopHoc;
    }

    public void setChiPhiLopHoc(String chiPhiLopHoc) {
        this.chiPhiLopHoc = chiPhiLopHoc;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }


}
