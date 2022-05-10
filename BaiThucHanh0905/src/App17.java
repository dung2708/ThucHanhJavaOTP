import java.util.ArrayList;
import java.util.ListIterator;
public class App17{
public static void main(String[] args){
    // khai báo1ArrayList có tên là arrlistString
    // có kiểu là String
    ArrayList<Integer> arrListInteger = new ArrayList<>();
    // thêm các phần tử sử dụng phương thức add()
    arrListInteger.add(0);
    arrListInteger.add(7);
    arrListInteger.add(1);
    arrListInteger.add(9);
    // duyệt theo kích thước của arrListInteger
    // sử dụng vòng lặp for duyệt theo đối tượng
    // trong đó kiều dữ liệu của biến number
    // phải trùng với kiểu dữ liệu của arrlistInteger
    System.out.println("Các phần tử có trong arrListInteger là: ");
    for (int number : arrListInteger){
       System.out.print(number+"\t");}
    }
}