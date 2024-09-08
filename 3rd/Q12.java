
import java.util.Scanner;

public class Q12 {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=obj.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=obj.nextInt();
      for(int j=0;j<i;j++){
        if(arr[i]==arr[j]){
          throw new ArithmeticException("hello");
        }
      }
    }
  }
}
