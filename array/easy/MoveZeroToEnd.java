package array.easy;

import utils.Helper;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        moveZeroToEnd(arr);
        Helper.printArray(arr);
    }

    private static void moveZeroToEnd(int[] arr) {
        int start = 0;
        int end = 0;
        while(start<arr.length && arr[start] != 0){
            start++;
        }
        end=start+1;
        while(end<arr.length){
            while (end+1<arr.length && arr[end] == 0) {
                end++;
            }
            Helper.swap2Number(arr, start, end);
            start++;
            end++;
        }
    }
}
