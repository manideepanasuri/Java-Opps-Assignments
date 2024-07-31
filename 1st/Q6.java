
import java.util.Scanner;

public class Q6 {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("please enter size of matrix");
    int n=obj.nextInt();
    int[][] array=new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        obj=new Scanner(System.in);
        array[i][j]=obj.nextInt();
      }
    }
    int i=0;
    int j=0;
    int iStart=0;
    int iEnd=n-1;
    int jStart=0;
    int jEnd=n-1;
    boolean already=false;
    boolean jR=false;
    boolean turn=false;
    for(int k=0;k<array.length;k++){
      for(int l=0;l<array[k].length;l++){
        System.out.print(array[i][j]+" ");
        
        if(i==iStart&&j!=jEnd){
          already=false;
          j++;
        }
        else if(i==iStart&&j==jEnd&&!already){
          i++;
          iStart++;
          already=true;
        }
        else if(j==jEnd&&i!=iEnd){
          already=false;
          
          i++;
        }
        else if(j==jEnd&&i==iEnd&&!already){
          
          already=true;
          j--;
          jEnd--;
        }
        else if(i==iEnd&&j!=jStart){
          already=false;
          j--;
        }
        else if(i==iEnd&&j==jStart&&!already){
          already=true;
          i--;
          iEnd--;
        }
        else if(j==jStart&&i!=iStart){
          already=false;
          i--;
        }
        else if(j==jStart&&i==iStart&&!already){
          already=true;
          j++;
          jStart++;
        }
      }
    }
  }
}