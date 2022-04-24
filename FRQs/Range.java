package FRQs;
import java.util.ArrayList;

public class Range implements NumberGroup {
    int size;
    ArrayList<Integer> groupOfNums = new ArrayList<Integer>();
    public boolean contains(int num) {
        boolean diversity;
        for(Integer i = 0; i <= groupOfNums.size() - 1; i++) {
            if(groupOfNums.get(i) == num) {
                diversity = true;
            } else {
                diversity = false;
            }
        }
        return diversity;
    }
}
