# Sorting Code

## Bubble Sort
In the bubble sort algorithm, two adjacent elements are compared and a swap is done if necessary to sort the data structure into a particular order. Once the entire data structure is traversed, that counts as one pass. The algorithm then executes a second pass. If no swaps are executed in a pass, that becomes the final pass and the bubble sort algorithm ends. There always needs to be a final pass with 0 swaps in order for the computer to guarantee that the data structure is in order, even though we as humans can already see it's in order after the final sort. The folowing code snippet shows my algorithm using a nested for loop in a method written, conveniently named bubbleSort(). There's also a tester main method written to test the code on an int array of ints 1-5000 randomized to be sorted.
```
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
```


## Selection Sort
In the selection sort algorithm, two parts of the int array, the unsorted subarray and the sorted subarray, are what come to mind. The unsorted subarray is traversed and we find the minimum value within the ENTIRETY of the unsorted subarray. If the minimum value is not at the minimum index of the unsorted subarray, a swap is done and the element at the minimum index is appended to the end of the sorted subarray. In my nested for loop down below, I execute the selection sort algorithm with the same int array of randomized integers 1-5000.

```
public void selectionSort(int[] arr) {
        int n = arr.length;
  
        // Unsorted subarray changes by index, with the "anchor" of the index moving up by 1 each iteration
        for (int i = 0; i < n-1; i++) {
            // Find the index of minimum element in unsorted subarray
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j; // Remember the new minimum
                }
            }
  
            // Swap the found minimum element with the element at the minimum index of unsorted subarray
            // And append it to end of sorted subarray
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
}
```

## Insertion Sort
Much like selection sort, insertion sort also deals with an unsorted and sorted subarray. Each element not being sorted is moved up an index and the element to be sorted is inserted into the appropriate index (inserted into index 0 first iteration, index 1 second iteration, etc.). The following is my selectionSort() method.
```
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
```

## Merge Sort
This is the most complicated sort, but also the most efficient one as when I ran it 12 times with 5000 random pieces of data, it produced the least amount of elapsed time. Essentially, the array is continuously split in half into temp arrays, until the elements are individually apart. This follows a divide-and-conquer logic, where each temp array is sorted before finally merging. However, just concatenating the temp arrays will only create an unsorted array again (two sets of sorted arrays put together is not one sorted array!). This is where recursion comes in, where if an element at the index of the left subarray is less than the element at index j of the right array, else recursively we must call the sort method again. I have two methods, one for merge and one for sort.
```
public void merge(int arr[], int l, int m, int r) { // l is left, m is middle, r is right
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        // Copy data to temp left and right arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        // Merge the temp arrays
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        // Copy any remaining elements of left subarray
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        // Copy any remaining elements of right subarray
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Sort method that sorts arr[l..r] using merge() as its final step
    
public void sort(int arr[], int l, int r) {
      if (l < r) {
          // Find the middle point
          int m =l+ (r-l)/2;

          // Sort first and second halves
          sort(arr, l, m); // Recursion
          sort(arr, m + 1, r); //Recursion

          // Merge the sorted halves
          merge(arr, l, m, r);
  }
}
```
{% include navigation.html %}
