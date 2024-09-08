import java.util.Scanner;

public class Q1{
	public static void main(String args[])throws NotSpecialExe{
	  Scanner obj=new Scanner(System.in);
	  System.out.println("enter a two digit number");
	  int n=obj.nextInt();
	  if(n<10||n>99){System.out.println("not a 2 digit number");}
	  else{
	    int a=n%10;
	    int b=n/10;
	    int sum=a+b;
	    int mul=a*b;
	    if(sum+mul==n){
	    System.out.println("is a special number");}
	    else{
	      throw new NotSpecialExe("this is me");
	    }
	  }
	}
}

class NotSpecialExe extends Exception{
  NotSpecialExe(String p){
    super(p);
    System.out.println("this is not a special number");
  }
}
