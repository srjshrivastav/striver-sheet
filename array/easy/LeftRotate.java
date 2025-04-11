package array.easy;

import utils.Helper;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        // rotateLeftByOne(arr);
        int k = Helper.getIntergerInput();
        // rotateLeftBy(k, arr);
        rotateRightBy(k, arr);
        Helper.printArray(arr);
    }

    private static void rotateLeftByOne(int[] arr) {
       int temp = arr[0];
       for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
       }
       arr[arr.length-1]=temp;
    }

    private static void rotateLeftBy(int k, int[] arr) {
        int shift = k%arr.length;
        //Reversing First K elements
        reverse(arr, 0, shift);
        //Reversing Last n-K elements
        reverse(arr, shift, arr.length);
        //Reversing whole array
        reverse(arr, 0, arr.length);
        
     }

     private static void rotateRightBy(int k, int[] arr) {
        int shift = k%arr.length;
        //Reversing First K elements
        reverse(arr, 0, arr.length-shift);
        //Reversing Last n-K elements
        reverse(arr, arr.length-shift, arr.length);
        //Reversing whole array
        reverse(arr, 0, arr.length);
        
     }

     private static void reverse(int[] arr, int start, int end){
        int temp;
        for(int i=start, j=end;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j-1];
            arr[j-1] = temp;
        }
     }
}
