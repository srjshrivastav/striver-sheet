package array.easy;

import utils.Helper;

public class SearchSingleNumberInArray {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        System.out.println(findSingleNumberInArray(arr));
    }

    /**
     * XOR Properties
     * XOR of Two same no. results 0 and XOR any Number with 0 results itself the number Ex.
     * 
     * 1 ^ 1 = 0, 5 ^ 5 = 0
     * 0 ^ 1 = 1, 0 ^ 2 = 2
     * @param arr
     * @return
     */
    private static int findSingleNumberInArray(int[] arr) {
        int xor = 0;
        for(int i:arr){
            xor = xor ^ i;
        }
        return xor;
    }
}
