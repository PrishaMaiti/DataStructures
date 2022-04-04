import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;

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
    //Get time elapsed
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
}
