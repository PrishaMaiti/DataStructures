import java.util.List;

public class MultipleGroups implements NumberGroup {
    private List<NumberGroup> groupList;

    public MultipleGroups(List<NumberGroup> list) {
        this.groupList = list;
    }

    public boolean contains(int num) {
        for(NumberGroup nGroup: groupList) {
            if(nGroup.contains(num)) {
                return true;
            }
        }
        return false;
    }
}
