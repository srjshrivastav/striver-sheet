package array.easy;

import utils.Helper;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        System.out.println("is Array Sorted? "+isArraySorted(arr));
    }

    private static boolean isArraySorted(int[] arr){
        boolean inc = false;
        boolean dec = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                inc = true;
            }
            if(arr[i-1]> arr[i]){
                dec = true;
            }
            if(inc && dec){
                return false;
            }
        }
        return true;
    }
}
