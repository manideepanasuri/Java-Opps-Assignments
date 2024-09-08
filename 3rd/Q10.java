public class Q10 {
  public static void main(String[] args) {
    try {
      callingerr();
    } catch (Exception e) {
      System.out.println("I am in main block");
    }
  }
  static void div0(){
    System.out.println("I am div0");
    int k=11/0;
  }
  static void callingerr(){
    System.out.println("I am callingerr");
    div0();
  }
}
