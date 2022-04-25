import java.util.Arrays;

public class DiverseArrayTester {
    static void testCase1() {
        int[] arr = {1, 3, 2, 7, 3};
        int[][] arr2D = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        System.out.println(DiverseArray.arraySum(arr));
        System.out.println(Arrays.toString(DiverseArray.rowSums(arr2D)));
        System.out.println(DiverseArray.isDiverse(arr2D));
    }
    static void testCase2() {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(DiverseArray.rowSums(arr2D)));

    }
    static void testCase3() {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(DiverseArray.isDiverse(arr2D));

    }
    public static void main(String[] args) {
        testCase3();
    }
}
