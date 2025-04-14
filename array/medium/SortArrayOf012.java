package array.medium;

import utils.Helper;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        // sort(arr);
        sortOptimized(arr);
        Helper.printArray(arr);
    }

    private static void sort(int[] arr) {
        int ones = 0;
        int zeros = 0;
        for (int i : arr) {
            if (i == 0) {
                zeros++;
            }
            if (i == 1) {
                ones++;
            }
        }
        int index = 0;
        while(index < zeros){
            arr[index++] = 0;
        }
        while (index < ones + zeros) {
            arr[index++] = 1;
        }
        while (index < arr.length) {
            arr[index++] = 2;
        }
    }


    // Dutch National flag algorithm.
    private static void sortOptimized(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        
        while(mid <= high){
            if(arr[mid] == 0){
                Helper.swap2Number(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                Helper.swap2Number(arr, mid, high);
                high--;
            }
        }
    }
}
