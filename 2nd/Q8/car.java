package Q8;
import Q8.Vehicle;

class car implements Vehicle{
  public int wheels;
  public int horsePower;
  public String engine;
  //constructor
  public car(int wheels,int horsePower,String engine){
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
    car obj=new car(4,100,"v8");
    obj.printWheels();
    obj.printHorsePower();
    obj.printEngine();
  }
  
  
  
}

