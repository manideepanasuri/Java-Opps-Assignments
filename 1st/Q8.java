/*
 *     8. Write a program to check whether an array is subset of another array.
Expected Output :
The given first array is : 4 8 7 11 6 9 5 0 2
The given second array is : 5 4 2 0 6
The second array is the subset of first array.
*/

public class Q8 {
  public static boolean  check(int[] array1,int[] array2){
    boolean isSub=true;
    for(int i=0;i<array1.length;i++){
      boolean exst=false;
      for(int j=0;j<array2.length;j++){
        if(array1[i]==array2[j]){
          exst=true;
          break;
        }
      }
      if(exst==false){
        isSub=false;
        break;
      }
    }
    return isSub;
  }
  public static void main(String[] args) {
    int[] array1=new int[]{4 ,8 ,7 ,11 ,6 ,9 ,5 ,0 ,2};
    int[] array2=new int[]{5 ,4 ,2 ,0,6};
    boolean chec=false;
    if(array1.length>array2.length){
      chec=check(array2,array1);
    }
    
    else{
      chec=check(array1, array2);
    }
    if(chec){
      System.out.println("Is Subset");
    }
    else{
      System.out.println("Not a Subset");
    }
  }
}
