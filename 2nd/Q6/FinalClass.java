public class FinalClass{
  public static void main(String args[]){
    //temp1 che=new temp1();
    temp check=new temp();
  }
}

final class temp{
  temp(){
    System.out.println("this is final class");
  }
}

//error
/*
class temp1 extends temp{
  temp1(){
    System.out.println("tryng to extend final class");
  }
}*/
