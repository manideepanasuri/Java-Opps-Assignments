import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            Thread leftThread = new Thread(() -> mergeSort(array, left, mid));
            Thread rigThread = new Thread(() -> mergeSort(array, mid + 1, right));

            leftThread.start();
            rigThread.start();

            try {
                leftThread.join();
                rigThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=obj.nextInt();
        int[] array=new int[n] ;
        System.out.println("Enter the values in array");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }

        System.out.println("Unsorted Array: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
        obj.close();
    }
}
