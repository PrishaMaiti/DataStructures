package MySort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
// Merge Sort Algorithm
public class MergeSort {
    private static ArrayList<Duration> times = new ArrayList<>();

    public void addTimes(Duration time) {
        times.add(time);
    }

    public long averageTimes() {
        long total = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (Duration i : times) {
            total += i.toNanos();
            if (i.toNanos() > max) {
                max = i.toNanos();
            }
            if (i.toNanos() < min) {
                min = i.toNanos();
            }
        }
        if (times.size() > 2) {
            total -= (max + min);
            return total/(times.size()-2);
        }
        return total/(times.size());
    }


    public void merge(int arr[], int l, int m, int r) { // l is left, m is middle, r is right
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        // Copy data to temp left and right arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        // Merge the temp arrays
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        // Copy any remaining elements of left subarray
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        // Copy any remaining elements of right subarray
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Sort method that sorts arr[l..r] using merge() as its final step
    
  public void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m); // Recursion
            sort(arr, m + 1, r); //Recursion
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int size = 5000;
        int[] arr = new int[size];

        // build an array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        
        MergeSort merge = new MergeSort();
        System.out.println("Before: ");
        merge.printArray(arr);
        Instant start = Instant.now();  // time capture -- start
        merge.sort(arr, 0, arr.length - 1);
        Instant end = Instant.now();    // time capture -- end
        System.out.println("\nAfter: ");
        merge.printArray(arr);
        Duration timeElapsed = Duration.between(start, end);
        times.add(timeElapsed);
        

        System.out.println("\nElapsed Time nano-sec: " + (float)timeElapsed.getNano());
        System.out.println("Per Element nano-sec: " + (float)timeElapsed.getNano()/size);
        System.out.println("Average Times nano-sec: " + (float) merge.averageTimes() + " out of " + times.size() + " trials");
    }
}
