import java.util.Scanner;

public class romanto_int {
  static int string_check(char a){
    if(a=='I'){return 1;}
    else if(a=='V'){return 5;}
    else if(a=='X'){return 10;}
    else if(a=='L'){return 50;}
    else if(a=='C'){return 100;}
    else if(a=='D'){return 500;}
    else if(a=='M'){return 1000;}
    else{return 0;}
  }
  static int romanToInt(String s) {
      int sum=0;
      if(s.length()<=1){sum=string_check(s.charAt(0));return sum;}
      else{
        int previous=0;
        int present=0;
      
        for(int i=1;i<s.length();i++){
            previous=string_check(s.charAt(i-1));
            present=string_check(s.charAt(i));
            if(present>previous){
                sum=sum-previous;
            }
            else{sum=sum+previous;}
        }
        sum=sum+present;

      return sum;
    }
  }
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String p=obj.next();
    int a=romanToInt(p);
    System.out.println(a);
  }

}
