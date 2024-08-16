import java.util.Scanner;

public class DynamicMethodDispatch{
  public static void main(String args[]){
    Animal obj;//creating a refrence pointer
    obj=new Animal();//same object method is beign overidden dynammically
    obj.DisplayType();
    obj=new human();
    obj.DisplayType();
    obj=new lion();
    obj.DisplayType();
    obj=new cow();
    obj.DisplayType();
  }
}

class Animal{
 
  void DisplayType(){
    System.out.println("All");
  }
  
}

class human extends Animal{
 
  void DisplayType(){
    System.out.println("ominivorus");
  }
}

class lion extends Animal{
  void DisplayType(){
    System.out.println("Carnivors");
  }
}

class cow extends Animal{
  void DisplayType(){
    System.out.println("Herbivorus");
  }
}
