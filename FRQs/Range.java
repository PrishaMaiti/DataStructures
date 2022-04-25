public class Range implements NumberGroup {
    int min, max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(int num) {
        if(num >= min && num <= max) {
            return true;
        }
        else
            return false;
    }
}
