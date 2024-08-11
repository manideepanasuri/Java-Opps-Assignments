package package1;

public class Shape{
  protected int Sides;
  public Shape(int Sides){
    this.Sides=Sides;
  }
  public void PrintSides(){
    System.out.println("No of sides are: "+Sides);
  }
}