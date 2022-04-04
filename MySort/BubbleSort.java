// Bubble Sort Algorithm
public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
 
    // Printer method
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Tester method
    public static void main(String args[]) {
        Sorts t = new Sorts(7);
        int time = t.getTimeElapsed();
        BubbleSort bubble = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before: ");
        bubble.printArray(arr);
        bubble.bubbleSort(arr);
        System.out.println("\nAfter: ");
        bubble.printArray(arr);
        System.out.println("\nElapsed Time: " + time);
    }
}
