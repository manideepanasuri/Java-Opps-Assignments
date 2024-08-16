public class FinalMeth{
  public static void main(String[] args){
    chil tem=new chil();
    tem.print();  
  }
}

class  base{
  final int print(){
    System.out.println("this is a final method");
    return 10;
  }
}

class chil extends base{
  //error
  /*
  int print(){
    System.out.println("this method is trying to over ride the final method");
  }
  */
  
}
