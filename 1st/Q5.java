public class Q5 {
  public static void quickSort(int[] array,int low,int high){
    if(low>=high){return ;}
    int pivot=array[high];
    int small=low-1;
    for(int i=low;i<=high;i++){
      if(array[i]<pivot){
        small++;
        int temp=array[small];
        array[small]=array[i];
        array[i]=temp;

      }
    }
    int temp=array[small+1];
    array[small+1]=array[high];
    array[high]=temp;
    quickSort(array, low, small);
    quickSort(array, small+2, high);
  }
  public static void main(String[] args) {
    int[] array1=new int[]{2 ,9 ,7 ,11, 12};
    int[] array2=new int []{8 ,10, 3, 1, 16};
    quickSort(array1, 0, array1.length-1);
    quickSort(array2, 0 ,array2.length-1);
    int[] array3=new int[array1.length+array2.length];
    int i=0;
    int j=0;
    int k=0;
    //creating new array with the data
    while(i<array1.length&&j<array2.length){
      if(array1[i]<array2[j]){
        array3[k]=array1[i];
        i++;k++;
      }
      else{
        array3[k]=array2[j];
        j++;k++;
      }
    }
    while (i<array1.length) {
      array3[k]=array1[i];
      k++;i++;
    }
    while (j<array2.length) {
      array3[k]=array2[j];
      k++;j++;
    }
    for (int index = 0; index < array1.length; index++) {
      System.err.print(array1[index]+ " ");
    }
    System.out.println();
    for (int index = 0; index < array2.length; index++) {
      System.out.print(array2[index] +" ");
    }
    System.err.println();
    //printing new array;
    for(int index=0;index<array3.length;index++){
      System.out.println(array3[index]);
    }
  }
}
