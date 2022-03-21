public class App2103 {
    public static void main(String[] args) throws Exception {
        System.out.println(" HINH CHU NHAT ");
        HinhChuNhat hcn = new HinhChuNhat();
                hcn.nhapChieuDai();
                hcn.nhapChieuRong();
                hcn.tinhChuVi();
                hcn.tinhDienTich();
                hcn.inChuVi();
                hcn.inDienTich();
       
        System.out.println("\n*\n");

        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhap();
        pt.giaiPhuongTrinh();
        System.out.println("\n***********\n");
        pt.inKetQua();


        Person ps = new Person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapAddress();
        ps.nhapGender();
        ps.inPersonID();
        ps.inPersonName();
        ps.inAddress();
        ps.inGender();
        System.out.println("\n****** SINH VIEN *****\n");


        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        System.out.println("\n***********\n");
        sv.inThongTin();

        System.out.println("\n****** PHUONG TRINH BAC HAI *****\n");


        
    }
}