public class EvenRange implements NumberGroup {
    int min, max;

    public EvenRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean contains(int num) {
        if(num >= min && num <= max && num%2==0) {
            return true;
        }
        else
            return false;
    }
}
