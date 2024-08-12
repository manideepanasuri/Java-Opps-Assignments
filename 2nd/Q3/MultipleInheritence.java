
import Interface.Method1;
public class MultipleInheritence {
  public static void main(String[] args) {
    temp p=new temp();
    p.printNum();
    p.ChangeNum(20);
    p.printNum();
  }
}

class temp implements Method1{
  int number=10;
  public void printNum(){
    System.out.println(number);
  }
  public void ChangeNum(int n){
    this.number=n;
  }
}