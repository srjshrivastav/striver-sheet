package array.easy;

import utils.Helper;

public class Search {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        int k = Helper.getIntergerInput();
        System.out.println(linearSearch(arr, k));
    }

    private static int linearSearch(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
