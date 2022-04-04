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
        int size = 5000;
        int[] arr = new int[size];

        // build an array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        
        MergeSort merge = new SelectionSort();
        System.out.println("Before: ");
        selection.printArray(arr);
        Instant start = Instant.now();  // time capture -- start
        selection.sort(arr);
        Instant end = Instant.now();    // time capture -- end
        System.out.println("\nAfter: ");
        selection.printArray(arr);
        Duration timeElapsed = Duration.between(start, end);
        

        System.out.println("\nElapsed Time nano-sec: " + (float)timeElapsed.getNano());
        System.out.println("Per Element nano-sec: " + (float)timeElapsed.getNano()/size);
    }
}