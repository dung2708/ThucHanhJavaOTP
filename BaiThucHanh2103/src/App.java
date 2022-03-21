import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

    }
    
}
class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    void nhapBanKinh() {
        System.out.println ("Hay nhap vao ban kinh hinh tron: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }
    void tinhChuVi() {
        cv = 2 * PI * r;
    }
    void tinhDienTich() {
        dt = PI * r * r;
    }
    void inChuVi() {
        System.out.println("chu vi hinh tron: " + cv);
    }
    void inDienTich() {
        System.out.println("Dien tich hinh tron: " + dt);
    }
}
