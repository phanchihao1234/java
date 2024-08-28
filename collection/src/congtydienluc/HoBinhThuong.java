package congtydienluc;

public class HoBinhThuong extends HoaDon{
    public HoBinhThuong(){
        super();
    }


    @Override
    public int tienDien() {
        int sTD=0;
        int kW1=0; int kW2=0;int kW3=0;
        if(soKWTieuThu()>100){
            kW3=soKWTieuThu()-100;
            kW2=50;
            kW1=50;
        }else if (soKWTieuThu()<=100&&soKWTieuThu()>=51){
            kW2=soKWTieuThu()-50;
            kW1=50;
        }else {
            kW1=soKWTieuThu();
        }
        return kW1*1500+kW2*2000+kW3*2800;
    }

    @Override
    public double tienThanhToan() {
        return tienDien()+(0.1*tienDien());
    }
    public void xuat() {
        super.xuat();
        System.out.println("Ho binh thuong ");
        System.out.printf("Tien phai tra: %f \n", tienThanhToan());
    }
}
