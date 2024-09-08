public class Q3{
	public static void main(String args[]) throws ParentExe,C1Exe,C2Exe{
	  try{
	    throw new ParentExe("Hello");
	  }
	  catch(ParentExe e){
	    e.printMsg();
	  }
	  try{
	    throw new C1Exe("hi");
	  }
	  catch(ParentExe e){
	    e.printMsg();
	  }
	  try{
	    throw new C2Exe("hiasdf");
	  }
	  catch(ParentExe e){
	    e.printMsg();
	  }
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
