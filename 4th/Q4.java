
import java.util.Scanner;

public class Q4 {
  public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter values of n and m");
    int n=obj.nextInt();
    int m=obj.nextInt();
    int[][] mat1=new int[n][m];
    int[][] mat2=new int[m][n];
    int[][] mat3=new int[n][n];
    System.out.println("Enter first matrix n X m");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        mat1[i][j]=obj.nextInt();
      }
    }
    System.out.println("Enter first matrix m X n");
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        mat2[i][j]=obj.nextInt();
      }
    }
    matmul[][] arrThreads=new matmul[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arrThreads[i][j]=new matmul(mat1, mat2, mat3, i, j);
        arrThreads[i][j].t.start();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        try {
          arrThreads[i][j].t.join();            
        } catch (Exception e) {
          System.out.println(e);
        }
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(mat3[i][j]+" ");
      }
      System.out.println();
    }
  }
}

class matmul implements Runnable{
  int[][] mat1;
  int[][] mat2;
  int[][] mat3;
  int row;
  int col;
  Thread t=new Thread(this);
  matmul(int[][] mat1,int[][] mat2,int[][] mat3,int row,int col){
    this.mat1=mat1;
    this.mat2=mat2;
    this.mat3=mat3;
    this.row=row;
    this.col=col;
  }
  public void run(){
    System.out.println(this.t);
    calculate();
  }
  public void calculate(){
    int num=0;
    for(int i=0;i<mat1[row].length;i++){
      num+=mat1[row][i]*mat2[i][col];
    }
    mat3[row][col]=num;
  }
}
