public class Q14{
	public static void main(String args[]){
	  rectangle r1=new rectangle(2,4);
	  square s1=new square(2);
	  System.out.println("Rectangle:");
	  r1.perimeter();
	  r1.area();
	  System.out.println("Square:");
	  s1.perimeter();
	  s1.area();
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
