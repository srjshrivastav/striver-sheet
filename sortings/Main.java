package sortings;

import utils.Helper;

public class Main {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        // Helper.printArray(Sort.selectionSort(arr));
        // Helper.printArray(Sort.bubbleSort(arr));
        // Helper.printArray(Sort.insertionSort(arr));
        // Sort.mergeSort(arr);
        // Sort.recursiveBubbleSort(arr, arr.length);
        // Sort.recursiveInsertionSort(arr,0);
        Sort.quickSort(arr);
        Helper.printArray(arr);
    }
}
