package suabai;

public class Basic extends GoiDV {
    private int soLop;
    public Basic(int soLop){
        this.phiDichVu=500L;
        this.hoTroPT=100L;
        this.dichVuXonghoi=false;
        this.chiPhiLopHoc=100L;
        this.soLop=soLop;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }
    @Override
    public Long tinhTien(){
        return phiDichVu+chiPhiLopHoc*soLop+hoTroPT;
    }
}
