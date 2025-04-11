package array.easy;

import utils.Helper;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        removeDuplicates(arr);
        Helper.printArray(arr);
    }

    private static void removeDuplicates(int[] arr) {
        int index = 0;
        int i = 1;
        for(i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[index++]=arr[i-1];
            }
        }
        arr[index++]=arr[--i];
    }
}
