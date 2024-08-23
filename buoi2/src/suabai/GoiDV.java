package suabai;

public class GoiDV {
    protected Long phiDichVu;
    protected Long chiPhiLopHoc;
    protected Boolean dichVuXonghoi;
    protected Long hoTroPT;
    public Long tinhTien(){
        return phiDichVu+chiPhiLopHoc+hoTroPT;
    }
}
