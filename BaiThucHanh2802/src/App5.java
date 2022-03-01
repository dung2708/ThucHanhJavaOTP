import java.util.Scanner;
public class App5 {
  public static void main(String[] args) throws Exception {
    Scanner baiso5 = new Scanner(System.in);
    int sum = 0, a;
    System.out.println("Nhap vao so bat ky: ");
    a = baiso5.nextInt();
    for(int i=1;i<=a/2;i++){
      if(a%i==0)
        sum+=i;
    }
    if(sum==a){
      System.out.println(a + " la so hoan thien");
    }
    else {
      System.out.println(a + " khong la so hoan thien");
    }
    
    baiso5.close();
  }
}