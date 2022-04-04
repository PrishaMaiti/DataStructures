public class InsertionSort {
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            // The anchor acts as a stationary point per iteration to be compared with arr[j]
            int anchor = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > anchor) {
                arr[j + 1] = arr[j]; // Element at arr[j] moves up by 1 index
                j = j - 1; // Reset j
            }
            arr[j + 1] = anchor; // Move anchor up by 1 index
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Sorts t = new Sorts(7);
        int time = t.getTimeElapsed();
        InsertionSort insertion = new InsertionSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before: ");
        insertion.printArray(arr);
        insertion.insertionSort(arr);
        System.out.println("\nAfter: ");
        insertion.printArray(arr);
        System.out.println("\nElapsed Time: " + time);
    }
    
}
