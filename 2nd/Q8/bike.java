package Q8;
import Q8.Vehicle;

class bike implements Vehicle{
  public int wheels;
  public int horsePower;
  public String engine;
  //constructor
  public bike(int wheels,int horsePower,String engine){
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
    bike obj=new bike(2,60,"petrol engine");
    obj.printWheels();
    obj.printHorsePower();
    obj.printEngine();
  }
  
  
  
}

