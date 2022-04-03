# Sorting Code

## Bubble Sort
In the bubble sort algorithm, two adjacent elements are compared and a swap is done if necessary to sort the data structure into a particular order. Once the entire data structure is traversed, that counts as one pass. The algorithm then executes a second pass. If no swaps are executed in a pass, that becomes the final pass and the bubble sort algorithm ends. There always needs to be a final pass with 0 swaps in order for the computer to guarantee that the data structure is in order, even though we as humans can already see it's in order after the final sort. The folowing code snippet shows my algorithm using a nested for loop in a method written, conveniently named bubbleSort(). There's also a tester main method written to test the code on an int array of ints 1-5000 randomized to be sorted.

## Selection Sort
In the selection sort algorithm, two parts of the int array, the unsorted subarray and the sorted subarray, are what come to mind. The unsorted subarray is traversed and we find the minimum value within the ENTIRETY of the unsorted subarray. If the minimum value is not at the minimum index of the unsorted subarray, a swap is done and the element at the minimum index is appended to the end of the sorted subarray. In my nested for loop and main method down below, I execute the selection sort algorithm with the same int array of randomized integers 1-5000.
{% include navigation.html %}
