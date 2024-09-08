public class Q9 {
  public static void main(String[] args) {
    try {
      int j=11/0;
    } catch (Exception e) {
      int p=11/0;
    }
    finally{
      System.out.println("hello i am finally");
    }
  }
}
