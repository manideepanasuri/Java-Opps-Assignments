public class Q17{
  static int sum(int a,int b){
    return a+b;
  }
  static int sum(int a,int b,int c){
    return a+b+c;
  }
  static int sum(int a,int b,int c,int d){
    return a+b+c+d;
  }
  static int sum(int a,int b,int c,int d,int e){
    return a+b+c+d+e;
  }
	public static void main(String args[]){
	  System.out.println(sum(1,2));
	  System.out.println(sum(1,2,3));
	  System.out.println(sum(1,2,3,4));
	  System.out.println(sum(1,2,3,4,5));
	}
}
