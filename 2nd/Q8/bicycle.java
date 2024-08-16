package Q8;
import Q8.Vehicle;

class bicycle implements Vehicle{
  public int wheels;
  public int horsePower;
  public String engine;
  //constructor
  public bicycle(int wheels,int horsePower,String engine){
    this.horsePower=horsePower;
    this.wheels=wheels;
    this.engine=engine;
  }
  public void printWheels(){
    System.out.println(wheels);
  }
  public void printHorsePower(){
    System.out.println(horsePower);
  }
  public void printEngine(){
    System.out.println(engine);
  }
  
  public static void main(String args[]){
    bicycle obj=new bicycle(2,0,"manual");
    obj.printWheels();
    obj.printHorsePower();
    obj.printEngine();
  }
  
  
  
}

