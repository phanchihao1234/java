package cooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonAn {
    private List<NguyenLieu> arr;

    public MonAn() {
        this.arr = new ArrayList<>();
    }

    public void nhap() {
        System.out.println("Moi ban nhap ga");
        NguyenLieu ga = new Ga();
        ga.nhap();
        this.arr.add(ga);
        System.out.println("Moi ban nhap Hat Sen");
        NguyenLieu hs = new HatSen();
        hs.nhap();
        this.arr.add(hs);
        System.out.println("Moi ban nhap Ca Rot");
        NguyenLieu ca = new CaRot();
        ca.nhap();
        this.arr.add(ca);
        System.out.println("Moi ban nhap Tao do");
        NguyenLieu tao = new TaoDo();
        tao.nhap();
        this.arr.add(tao);
        System.out.println("Moi ban nhap Nam dong co");
        NguyenLieu nam = new NamDongCo();
        nam.nhap();
        this.arr.add(nam);
    }

    public float tinhNangLuong(int flag) {
        float sum = 0;
        for (NguyenLieu a : this.arr) {
            if (flag == 1) {
                sum += a.getKhoiLuong() / 100.0f * a.getCarb();
            } else if (flag == 2) {
                sum += a.getKhoiLuong() / 100.0f * a.getFat();
            } else if (flag == 3) {
                sum += a.getKhoiLuong() / 100.0f * a.getFatBaoHoa();
            } else if (flag == 4) {
                sum += a.getKhoiLuong() / 100.0f * a.getProtein();
            } else if (flag == 5) {
                sum += a.getKhoiLuong() / 100.0f * a.getCalo();
            }
        }
        return sum * 0.8f;
    }

    public void cau2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap chi so carb can thiet cho moi bua an ");
        int carb = sc.nextInt();
        float nangLuong = tinhNangLuong(1);
        if (carb > nangLuong) {
            System.out.printf("Co the em can bo sung them %f carb nua nha", carb - nangLuong);
        }
        System.out.println("Moi ban nhap chi so fat can thiet cho moi bua an ");
        int fat = sc.nextInt();
        nangLuong = tinhNangLuong(2);
        if (fat > nangLuong) {
            System.out.printf("Co the em can bo sung them %f fat nua nha", fat - nangLuong);
        }
        System.out.println("Moi ban nhap chi so fatBH can thiet cho moi bua an ");
        int fatBH = sc.nextInt();
        nangLuong = tinhNangLuong(3);
        if (fatBH > nangLuong) {
            System.out.printf("Co the em can bo sung them %f fatBH nua nha", fatBH - nangLuong);
        }
        System.out.println("Moi ban nhap chi so protein can thiet cho moi bua an ");
        int protein = sc.nextInt();
        nangLuong = tinhNangLuong(4);
        if (protein > nangLuong) {
            System.out.printf("Co the em can bo sung them %f protein nua nha", protein - nangLuong);
        }
        System.out.println("Moi ban nhap chi so calo can thiet cho moi bua an ");
        int calo = sc.nextInt();
        nangLuong = tinhNangLuong(5);
        if (calo > nangLuong) {
            System.out.printf("Co the em can bo sung them %f calo nua nha", calo - nangLuong);
        }

    }
    public float cau3(){
        if(tinhNangLuong(5)-600>0){
            return 30*(tinhNangLuong(5)-600)/150f;
        }else {
            return 0;
        }
    }


}
