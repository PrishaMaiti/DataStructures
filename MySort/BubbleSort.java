import java.time.Duration;
import java.time.Instant;
// Bubble Sort Algorithm
public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
 
    // Printer method
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Tester method
    public static void main(String args[]) {
        int size = 5000;
        int[] arr = new int[size];

        // build an array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        
        BubbleSort bubble = new BubbleSort();
        System.out.println("Before: ");
        bubble.printArray(arr);
        Instant start = Instant.now();  // time capture -- start
        bubble.bubbleSort(arr);
        Instant end = Instant.now();    // time capture -- end
        System.out.println("\nAfter: ");
        bubble.printArray(arr);
        Duration timeElapsed = Duration.between(start, end);
        

        System.out.println("\nElapsed Time nano-sec: " + (float)timeElapsed.getNano());
        System.out.println("Per Element nano-sec: " + (float)timeElapsed.getNano()/size);
    }
}
