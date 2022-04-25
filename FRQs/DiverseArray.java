import java.util.HashSet;

class Debug {
    public static boolean on = true;
    public static void print( String s ) {
        if (on) System.out.println(s);
    }
}

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D) {
        Debug.print("Length of arr2D==>" + arr2D.length);
        int arrResult[] = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++){
            arrResult[i] = arraySum(arr2D[i]);
            Debug.print("Row sum for #" + i + " => " + arrResult[i]);
        }
        return arrResult;
    }
    public static boolean isDiverse(int[][] arr2D) {
        HashSet<Integer> visitedElems = new HashSet<Integer>();
        for(int i = 0; i < arr2D.length; i++) {
            for(int j = 0; j < arr2D[i].length; j++) {
                if(visitedElems.contains(arr2D[i][j])) {
                    return false;
                } else {
                    visitedElems.add(arr2D[i][j]);
                }
            }
        }
        return true;
    }
}
