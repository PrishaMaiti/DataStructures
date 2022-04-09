package MySort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
// Selection Sort Algorithm
public class SelectionSort {
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
        
        SelectionSort selection = new SelectionSort();
        System.out.println("Before: ");
        selection.printArray(arr);
        Instant start = Instant.now();  // time capture -- start
        selection.selectionSort(arr);
        Instant end = Instant.now();    // time capture -- end
        System.out.println("\nAfter: ");
        selection.printArray(arr);
        Duration timeElapsed = Duration.between(start, end);
        times.add(timeElapsed);
        

        System.out.println("\nElapsed Time nano-sec: " + (float)timeElapsed.getNano());
        System.out.println("Per Element nano-sec: " + (float)timeElapsed.getNano()/size);
        System.out.println("Average Times nano-sec: " + (float) selection.averageTimes() + " out of " + times.size() + " trials");
    }
}