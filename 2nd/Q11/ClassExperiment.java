public class ClassExperiment{
  public static void main(String args[]){
    Parent p1=new Parent();
    p1.print1();
    Child c1=new Child();
    c1.print2();
    c1.print1();
  }
}

class Parent{
  void print1(){
    System.out.println("This is Parent Class");
    
  }
}

class Child extends Parent{
  void print2(){
    System.out.println("this is child calss");
  }
}
