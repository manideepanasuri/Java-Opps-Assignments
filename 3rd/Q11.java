public class Q11 {
  public static void main(String[] args) {
    try {
      callingerr();
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("I am in main block");
    }
  }
  static void div0()throws  myexe{
    System.out.println("I am div0");
    throw new myexe("i am div0");
  }
  static void callingerr()throws myexe{
    System.out.println("I am callingerr");
    div0();
  }
}
class myexe extends Exception{
  myexe(String p){
    super(p);
    System.out.println("custom error");
  }
}
