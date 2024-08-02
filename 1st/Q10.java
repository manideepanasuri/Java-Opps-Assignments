/*
 *10. Create a base class Shape containing name as field.  Class Shape will have a public method called getName() that returns the name of the shape. Create a class Circle deriving Shape having radius as field and calculate() method to calculate the area. Then, create a class Cylinder deriving Circle having height as field and calculate() method. Take the radius and height values from user as input and calculate areas of circle and cylinder as output. Write a Java program to implement the same. 
    Test Case:
    Input:
                        Radius: 4
                        Height: 5
    Output:
                        Area of Circle: 50.27
                        Area of Cylinder: 226.19
*/

public class Q10 {
  public static void main(String[] args) {
    cylinder len=new cylinder("cylinder", 4, 5);
    len.calculate();
  }
}

class shape{
  String name;
  shape(String name){
    this.name=name;
  }
}
class circle extends shape{
  double radius;
  circle(String name,double radius){
    super(name);
    this.radius=radius;
  }
  public double calculate(){
    double area=3.14*this.radius*this.radius;
    return area;
  }

}

class cylinder extends circle{
  double height;
  cylinder(String name,double radius,double height){
    super(name,radius);
    this.height=height;
  }
  public double calculate(){
    System.out.println("area of circle is "+super.calculate());
     double area=2*3.14*radius*this.height+2*super.calculate();
     System.out.println("area of cylinder is "+area);
     return area;
  }
}