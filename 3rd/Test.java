public class Test {
  public static void main(String[] args) {
    honda p=new honda();
    p.print();
    p.run();
  }
}
abstract class bike{
  bike(){
    System.out.println("bike");
  }
  abstract void run();
  void print(){
    System.out.println("bike print");
  }
}
class honda extends bike{
  void run(){
    System.out.println("honda running");
  }
}
