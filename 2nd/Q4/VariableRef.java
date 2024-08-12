



public class VariableRef {
  public static void main(String[] args) {
    Class1 obj=new Class2(10, 20);
    obj.PrintNum();
  }
}


class Class1 {
  int num;
  Class1(int num){
    this.num=num;
  }  
  void PrintNum(){
    System.out.println(this.num);
  }
}

class Class2 extends Class1{
  int num;
  Class2(int n1,int n2){
    super(n1);
    this.num=n2;
  }
  void PrintNum(){
    System.out.println("this is to print super class method");
    super.PrintNum();
    System.out.println("this is class method");
    System.out.println(this.num);
  }
}


