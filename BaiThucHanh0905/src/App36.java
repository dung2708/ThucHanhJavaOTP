import java.util.ArrayList;
import java.util.ListIterator;
import java.util.LinkedList;
public class App36{
public static void main(String[] args){
    // khai báo 1 LinkedList có tên là list
    // có kiểu là String
    LinkedList<String> list = new LinkedList<String>();
    // add objects to list
    list.add("JAVA");
    list.add("PHP");
    list.add("C#");
    list.add("C++");

    System.out.println("ví dụ sử dụng phương thức addAll()");
    System.out.println("----------------------------------");
    //thêm các phần tử của list vào listA
    LinkedList<String> listA = new LinkedList<String>();
    listA.addAll(list);
    System.out.print("listA:");
    showList(listA);
    System.out.println("ví dụ sử dụng phương thức retainAll()");
    System.out.println("----------------------------------");
    //khởi tạo listB
    LinkedList<String> listB = new LinkedList<String>();
    listB.add("Java");
    //xóa những phần tử không thuộc listB khỏi listA
    listA.retainAll(listB);
    System.out.print("listA:");
    showList(listA);

    System.out.println("ví dụ sử dụng phương thức removeAll()");
    System.out.println("----------------------------------");
    //xóa những phần tử thuojc listB khỏi list
    list.removeAll(listB);
    System.out.print("list:");
    showList(list);



}    
public static void showList(LinkedList<String> list) {
    //show list through for-each
    for (String obj : list) {
        System.out.print("\t" + obj +",");
    }
    System.out.println();
}
}