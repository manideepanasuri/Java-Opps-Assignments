public class Q4{
	public static void main(String args[]){
	  temp tem=new temp();
	  try{
	    //tem.meth1();
	    tem.meth2();
	    tem.meth3();
	  }
	  catch(ParentExe e){
	    e.printMsg();
	  }
	}

}

class temp{
  void meth1() throws C2Exe{
    throw new C2Exe("hi");
  }
  void meth2() throws C1Exe{
    throw new C1Exe("hdfi");
  }
  void meth3() throws ParentExe{
    throw new ParentExe("hiasdfaad");
  }
}

class ParentExe extends Exception{
  ParentExe(String p){
    super(p);
  }
  void printMsg(){
    System.out.println("This is parent Exception");
    
  }
}

class C1Exe extends ParentExe{
  C1Exe(String p){
    super(p);
  }
  void printMsg(){
    System.out.println("This is C1Exe Exception");
    
  }
}

class C2Exe extends ParentExe{
  C2Exe(String p){
    super(p);
  }
  void printMsg(){
    System.out.println("This is C2Exe Exception");
    
  }
}
