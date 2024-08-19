import java.util.Scanner;
public class Q15{
	public static void main(String args[]){
	  Scanner obj=new Scanner(System.in);
	  
	  System.out.println("Enter no of square");
	  int n=obj.nextInt();
	  square[] s1=new square[n];
	  for(int i=0;i<s1.length;i++){
	    System.out.println("Enter square side:");
	    double side=obj.nextDouble();
	  	s1[i]=new square(side);
	  }
	  for(int i=0;i<s1.length;i++){
	    System.out.println("square "+(i+1));
	    s1[i].perimeter();
	    s1[i].area();
	    System.out.println();
	  }
	  
	}
}
class rectangle{
  double length;
  double bredth;
  rectangle(double length,double bredth){
    this.length=length;
    this.bredth=bredth;
  }
  double perimeter(){
    double temp=2*(length+bredth);
    System.out.println("perimeteris: "+temp);
    return temp;
  }
  double area(){
    double area=length*bredth;
    System.out.println("Area: "+area);
    return area;
  }
}

class square extends rectangle{
  square(double side){
    super(side,side);
  } 
}
