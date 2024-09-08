public class Q8 {
  public static void main(String[] args) {
    int[] arr=new int[5];
    try {
      arr[10]=11/0;
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
  }
}
