import java.util.ArrayList;

public class MultipleGroupsTester {

    static void testCase1() {
        ArrayList<NumberGroup> groupList = new ArrayList<NumberGroup>();
        groupList.add(new Range(5,8));
        groupList.add(new Range(10,12));
        groupList.add(new Range(1,6));
        groupList.add(new EvenRange(19,23));
        MultipleGroups multiple1 = new MultipleGroups(groupList);

        System.out.println(multiple1.contains(2));
        System.out.println(multiple1.contains(9));
        System.out.println(multiple1.contains(6));
        System.out.println(multiple1.contains(20));
        System.out.println(multiple1.contains(21));
    }
    public static void main(String[] args) {
        testCase1();
    }
}
