package Q18;
import Q18.addition.addition;
import Q18.multiplication.multiplication;
import Q18.division.division;
import Q18.substraction.substraction;

import java.util.Scanner;

public class Q18{
	public static void main(String args[]){
	  Scanner obj=new Scanner(System.in);
	  while(true){
	  System.out.println("Enter 2 numbers");
	    double a=obj.nextDouble();
	    double b=obj.nextDouble();
	    
	    System.out.println("Enter 1 to add");
	    System.out.println("Enter 2 to sub");
	    System.out.println("Enter 3 to mul");
	    System.out.println("Enter 4 to divide");
	    int n=obj.nextInt();
	    if(n==1){
	      addition a1=new addition(a,b);
	      System.out.println("Sum is: "+a1.sum);
	    }
	    else if(n==2){
	      substraction s1=new substraction(a,b);
	      System.out.println("dif is: "+s1.sub);
	    }
	    else if(n==3){
	      multiplication m1=new multiplication(a,b);
	      System.out.println("product is: "+m1.mul);
	    }
	    else if(n==4){
	      div d1=new div(a,b);
	      System.out.println("div is: "+d1.ret());
	    }
	    else{return;}
	  }
	}
}

class div extends division{
  div(double a,double b){
    super(a,b);
  }
  double ret(){
    return super.div;
  }
}
