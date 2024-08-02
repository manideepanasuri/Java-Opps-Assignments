

/*
 *5. Given an unsorted array of elements, find the longest consecutive elements sequence (must be in ascending order) in the array using a Java program.
    Testcases:
        1) Array:  1 8 3 7 2 4 8 1
        Output: 2 4 8
*/

public class Q5{
  
  public static void main(String[] args) {
    int[] array=new int[]{1, 8, 3, 7, 2, 4, 8, 1};
    int maxS=0;
    int maxE=0;
    
    int start=0;
    
    int end=0;
    for(int i=1;i<array.length;i++){
      if(array[i-1]<=array[i]){
        end=i;
        if(end-start>maxE-maxS){
          maxE=end;
          maxS=start;
        }
      }
      else{
        start=i;
        end=i;
        if(end-start>maxE-maxS){
          maxE=end;
          maxS=start;
        }
      }
    }
    for(int i=maxS;i<=maxE;i++){
      System.err.println(array[i]);
    }
  }
}