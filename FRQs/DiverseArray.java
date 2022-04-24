package FRQs;
import java.util.ArrayList;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D) {
        int rows;
        ArrayList<Integer> arr = new ArrayList<Integer>;
        for(int r = 0; r < arr.length(); r++) {
            arr.add(arraySum(arr));
        }
        int[] arrResult = arr;
        return arrResult;
    }
    public static boolean isDiverse(int[][] arr2D) {
        boolean diversity = true;
        for(int i = 0; i < arr2D.rows.length; i++) {
            for(int j = i + 1; j < arr2D.rows.length(); j++) {
                if(arr2D[j][i] == arr2D[i][j]) {
                    diversity = false;
                }
            }
        }
        return diversity;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 3};
        arraySum(arr);
    }
}
