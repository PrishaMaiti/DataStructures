package MySort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sorts {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public Sorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        data.sort(Comparator.naturalOrder());
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }
    // Get time elapsed
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
    // Get user input array of ints
    public int[] getUnsorted() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter unsorted integer array (separated by commas): ");
      String str = sc.next();
      String[] strArr = str.split(",");
      int[] array = new int[strArr.length];
      for (int i = 0; i < strArr.length; i++) {
        array[i] = Integer.valueOf(strArr[i]);
      }
      return array;
    }
}
