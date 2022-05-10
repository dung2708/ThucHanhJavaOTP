import java.util.ArrayList;
import java.util.ListIterator;
public class App16{
public static void main(String[] args){
    // khai báo1ArrayList có tên là arrlistString
    // có kiểu là String
    ArrayList<String> arrListString = new ArrayList<>();
    // thêm các phần tử sử dụng phương thức add()
    arrListString.add("JAVA");
    arrListString.add("PHP");
    arrListString.add("C#");
    arrListString.add("C++");
    // duyệt theo kích thước của arrlistString
    // sử dụng vòng lặp for thông thường
    // phương thức arrListString.size() sẽ trả về số phần tử của arrListString
    // và sau đó lấy phần tử tai vị trí thứithông qua hàm get()
    // sau đó hiến thị giá trị phần tử đó ra
    System.out.println("Các phần tử có trong arrListString là: ");
    for (int i = 0 ; i < arrListString.size(); i++){
        System.out.print(arrListString.get(i)+"\t");
    }
}
}
