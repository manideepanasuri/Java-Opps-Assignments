public class ClassExperiment{
  public static void main(String args[]){
    Parent p1=new Parent();
    //error
    p1.print1();
    Child c1=new Child();
    c1.print2();
    //error
    c1.print1();
  }
}

class Parent{
  private void print1(){
    System.out.println("This is Parent Class");
    
  }
}

class Child extends Parent{
  void print2(){
    System.out.println("this is child calss");
  }
}
