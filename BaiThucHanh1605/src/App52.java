import java.util.HashSet;
import java.util.Scanner;

public class App52 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        //them cac phan tu vao hashsetInteger
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        //hien thi cac phan tu trong hashsetInteger
        System.out.println("Cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number=scanner.nextInt();
        // thêm một phần tử mới vào hashSetInteger từ bàn phím
        // nếu phần tử đó đã tồn tại thì thông báo đã tồn tại ngược lại thì thêm vào
        if (!hashSetInteger.contains(number)){
           hashSetInteger.add(number);
           System.out.println("Thêm thành công!");
           System.out.println("Các phần tử trong hashSetInteger sau khi thêm: ");
           System.out.println(hashSetInteger);
        }else{
            System.out.println("Phần tử" + number + "đã tồn tại!");  
    }
}
}