/*
    4. Write a java program to left and right rotate the array by a given number of positions. (Number of positions to shift must be read from the console.)
      Testcases:
          1) Array: 9 5 7 2 6 3 8
      Positions: 3
      Output:
      Left rotate:  2 6 3 8 9 5 7
      Right rotate: 6 3 8 9 5 7 2
*/

import java.util.Scanner;

class Q4{
  public static void main(String[] args){
    int[] array=new int[]{9 ,5 ,7 ,2 ,6 ,3 ,8};
    Scanner obj=new Scanner(System.in);
    int shift=obj.nextInt();
    int[] array2=new int[array.length];
    int i=shift;
    //right rotate;
    System.out.print("\n Right Rotate: ");
    for(int j=0;j<array.length;j++){
      array2[i]=array[j];
      i++;
      i=i%array.length;
    }
    for(int j=0;j<array2.length;j++){
      System.out.print(array2[j]+" ");
    }
    //left rotate;
    i=shift;
    int [] array3=new int[array.length];
    for(int j=0;j<array.length;j++){
      int temp=array.length-1-i;
      array3[temp]=array[array.length-1-j];
      i++;
      i=i%array.length;
      
    }
    System.out.print("\n Left Rotate: ");
    for(int j=0;j<array3.length;j++){
      System.out.print(array3[j]+" ");
    }
    
  }
}
