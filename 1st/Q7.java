
import java.util.Scanner;

public class Q7 {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("Please enter matrix Size: ");
    int n=obj.nextInt();
    System.out.println("enter the first matrix");
    int[][] mat1=new int[n][n];
    int[][] mat2=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        mat1[i][j]=obj.nextInt();
      }
    }
    System.out.println("enter the second matrix");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        mat2[i][j]=obj.nextInt();
      }
    }
    int[][] matPro=new int[n][n];
    for(int k=0;k<n;k++){
      for(int i=0;i<n;i++){ 
        int sum=0;       
        for(int j=0;j<n;j++){
          sum=sum+mat1[k][j]*mat2[j][i];
        }
        matPro[k][i]=sum;
        
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(matPro[i][j]+" ");
      }
      System.err.println();
    }

    
    //closing obj input
    obj.close();
  }
  
}
