import java.util.Scanner;

public class Apphcn {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
    
    }
}
class HinhChuNhat{
    float dai;
    float rong;
    float cv;
    float dt;

    void nhapChieuDai() {
        System.out.println("Hay nhap chieu dai: ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }

    void nhapChieuRong() {
        System.out.println("Hay nhap chieu rong: ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }

    public void tinhChuVi() {
        cv = 2 * ( dai + rong);
    }

    public void tinhDienTich() {
        dt = dai * rong;
    }

    public void inChuVi() {
        System.out.println("Chu vi hinh chu nhat là: " + cv);
    }

    public void inDienTich() {
        System.out.println("Dien tich hinh chu nhat la: " + dt);
    }
}
