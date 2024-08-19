public class Q16{
	public static void main(String args[]){
	  square s1=new square();
	  s1.print();
	  s1.printp1();
	}
}

class shape{
  void print(){
    System.out.println("this is shape");
  }
}

class rectangle extends shape{
  void print(){
    System.out.println("this is rectangle");
  }
  void printp(){
    super.print();
  }
}

class circle extends shape{
  void print(){
    System.out.println("this is circle");
  }
}

class square extends rectangle{
  void print(){
    System.out.println("this is square");
  }
  void printp1(){
    super.print();
    super.printp();
  }
}
