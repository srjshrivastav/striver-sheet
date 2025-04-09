package sortings;

public class Sort {

    /**
     * Choose one at a time and swap with current index
     * 
     * @param arr
     * @return
     */
    public static int[] selectionSort(int[] arr) {
        int minIndex = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    /**
     * Sort Array from Last index i.e largest number at last first
     * Swap every adjacent element
     * 
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Insertion Sort: Set the current Element to Index I and swap the left elements
     * till its right position
     * 
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Merge Sort
     * @param arr
     */
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * Divide array range in half
     * @param arr
     * @param start
     * @param end
     */
    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start+end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    /**
     * Merge those range into temp array and then copy back to the original array
     * @param arr
     * @param start
     * @param mid
     * @param end
     */
    private static void merge(int[] arr, int start, int mid, int end) {
        int[] result = new int[end + 1];
        int i = 0, left = start, right = mid + 1;
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                result[i++] = arr[left];
                left++;
            } else {
                result[i++] = arr[right];
                right++;
            }
        }

        while (left <= mid) {
            result[i++] = arr[left++];
        }

        while (right <= end) {
            result[i++] = arr[right++];
        }
        for (int k = start; k <= end; k++) {
            arr[k] = result[k - start];
        }
    }
}
