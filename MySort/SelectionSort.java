// Selection Sort
public class SelectionSort {
    public void selectionSort(int[] arr) {
        int n = arr.length;
  
        // Unsorted subarray changes by index, with the "anchor" of the index moving up by 1 each iteration
        for (int i = 0; i < n-1; i++) {
            // Find the index of minimum element in unsorted subarray
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j; // Remember the new minimum
                }
            }
  
            // Swap the found minimum element with the element at the minimum index of unsorted subarray
            // And append it to end of sorted subarray
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
  
    // Prints the array
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
  
    // Tester main method
    public static void main(String args[]) {
        Sorts t = new Sorts(7);
        int time = t.getTimeElapsed();
        SelectionSort selection = new SelectionSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before: ");
        selection.printArray(arr);
        selection.selectionSort(arr);
        System.out.println("\nAfter: ");
        selection.printArray(arr);
        System.out.println("\nElapsed Time: " + time);
    }
}