import java.util.Arrays;

public class Q3 {

    // Function to merge two sorted subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements of leftArray if any
        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        // Copy remaining elements of rightArray if any
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    // Function for merge sort with multithreading
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Create two threads for parallel sorting
            Thread leftSorter = new Thread(() -> mergeSort(array, left, mid));
            Thread rightSorter = new Thread(() -> mergeSort(array, mid + 1, right));

            // Start both threads
            leftSorter.start();
            rightSorter.start();

            // Wait for both threads to finish
            try {
                leftSorter.join();
                rightSorter.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Main function to test the merge sort with threads
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        // Sort the array using multithreaded merge sort
        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
