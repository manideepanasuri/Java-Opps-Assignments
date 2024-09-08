public class Q7{
  public static void main(String[] args) {
      try {
          throwerr("hello");
      } catch (myexe e) {
        System.out.println(e);
        e.print();

      }
  }
  static void throwerr(String p)throws  myexe{
    throw new myexe(p);
  } 
}

class myexe {
  String store;
  myexe(String p){
    //super(p);
    this.store=p;
  }
  void print(){
    System.out.println(store);
  }
}