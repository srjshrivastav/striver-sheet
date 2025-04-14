package array.easy;

import utils.Helper;

public class SearchSingleNumberInArray {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        System.out.println(findSingleNumberInArray(arr));
    }

    private static int findSingleNumberInArray(int[] arr) {
        int xor = 0;
        for(int i:arr){
            xor = xor ^ i;
        }
        return xor;
    }
}
