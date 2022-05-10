import java.util.Scanner;
import java.util.LinkedList;
public class App39{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
       // khai báo1danh sách liên kết
       // lưu trữ các tháng trong năm
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Tháng 1");
        linkedList.add("Tháng 2");
        linkedList.add("Tháng 3");
        linkedList.add("Tháng 4");
        linkedList.add("Tháng 5");
        linkedList.add("Tháng 6");
        linkedList.add("Tháng 7");
        linkedList.add("Tháng 8");
        linkedList.add("Tháng 9");
        linkedList.add("Tháng 10");
        linkedList.add("Tháng 11");
        linkedList.add("Tháng 12");
        System.out.println("Nhập vào chi số của phần tử cần lấy: ");
        int index=scanner.nextInt();

        // kiểm tra nếu chi số lớn hơn hoặc bằngở
        // và nhỏ hơn kích thước của linkedList-1thì mới lấy
        // ngược lại thông báo lỏi
        if ((index<0) || (index>(linkedList.size()-1))){
            System.out.println("Chỉ số cần lấy phải lớn hơnevà nhỏ hơn"
            +(linkedList.size()-1));
        }else{
            // truy cập phần tử có chi số index trong linkedList
            // vì linkedList có kiểu là String
            // nên các phần tử con của nó cũng có kiểu dữ liệu là String
            String node=linkedList.get(index);
            System.out.println("Phần tử có chi số="+index+"trong linkedList là "+ node);
        // truy cập phần tử đầu tiên trong danh sách
        // sử dụng phương thức getFirst()
        String firstNode=linkedList.getFirst();
        // truy cập phần tử đầu tiên trong danh sách
        // sử dụng phương thức getlast()
        String lastNode = linkedList.getLast();
        System.out.println("\nPhần tử đầu tiên trong danh sách là"+firstNode+
            " ; Phần tử cuối cùng trong danh sách là "+ lastNode);
        }

    }
}