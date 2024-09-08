
import java.util.Scanner;

public class Q13 {
  public static void main(String[] args) {
    System.out.println("enter string");
    Scanner obj=new Scanner(System.in);
    String p=obj.next();
    boolean a=false;
    boolean e=false;
    boolean i=false;
    boolean o=false;

    boolean u=false;
    p.toLowerCase();

   if(p.contains("a")){a=true;}
   if(p.contains("e")){e=true;}
   if(p.contains("i")){i=true;}
   if(p.contains("o")){o=true;}
   if(p.contains("u")){u=true;}
   if(a||e||i||o||u){
    System.out.println("owel exists");
   }
   else{
    throw new ArithmeticException("enter ovel");
   }
  }
}
