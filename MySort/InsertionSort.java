package MySort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
// Insertion Sort Algorithm
public class InsertionSort {
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

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // The anchor acts as a stationary point per iteration to be compared with arr[j]
            int anchor = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > anchor) {
                arr[j + 1] = arr[j]; // Element at arr[j] moves up by 1 index
                j = j - 1; // Reset j
            }
            arr[j + 1] = anchor; // Move anchor up by 1 index
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
        
        InsertionSort insertion = new InsertionSort();
        System.out.println("Before: ");
        insertion.printArray(arr);
        Instant start = Instant.now();  // time capture -- start
        insertion.insertionSort(arr);
        Instant end = Instant.now();    // time capture -- end
        System.out.println("\nAfter: ");
        insertion.printArray(arr);
        Duration timeElapsed = Duration.between(start, end);
        times.add(timeElapsed);
        

        System.out.println("\nElapsed Time nano-sec: " + (float)timeElapsed.getNano());
        System.out.println("Per Element nano-sec: " + (float)timeElapsed.getNano()/size);
        System.out.println("Average Times nano-sec: " + (float) insertion.averageTimes() + " out of " + times.size() + " trials");
    }
    
}
