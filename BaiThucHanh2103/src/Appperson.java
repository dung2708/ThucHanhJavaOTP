import java.util.Scanner;
public class Appperson {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapAddress();
        ps.nhapGender();
        ps.inPersonID();
        ps.inPersonName();
        ps.inAddress();
        ps.inGender();


}
}
class Person{
    String PersonID;
    String PersonName;
    String Address;
    Boolean Gender;

    public void nhapPersonID() {
        System.out.println("Hay nhap PersonID: ");
        Scanner scanner = new Scanner(System.in);
        PersonID = scanner.nextLine();
    }
    public void nhapPersonName() {
        System.out.println("Hay nhap PersonName: ");
        Scanner scanner = new Scanner(System.in);
        PersonName = scanner.nextLine();
    }
    public void nhapAddress() {
        System.out.println("Hay nhap Address: ");
        Scanner scanner = new Scanner(System.in);
        Address = scanner.nextLine();
    }
    public void nhapGender() {
        System.out.println("Hay nhap Gender: ");
        Scanner scanner = new Scanner(System.in);
        Gender = scanner.nextBoolean();
    }
    public void inPersonID() {
        System.out.println("PersonID la: " + PersonID);
    }
    public void inPersonName() {
        System.out.println("PersonName la: " + PersonName);
    }
    public void inAddress() {
        System.out.println("Address la: " + Address);
    }
    public void inGender() {
        System.out.println("Gender la: " + Gender);
    }
}
