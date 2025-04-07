package recursion;

import utils.Helper;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = Helper.takeArrayInput();
        int[] result = new int[array.length];
        doReverse(array.length, array, result);
        Helper.printArray(result);
    }

    //Should be use two pointer approach for better Memory optimization
    private static void doReverse(int length, int[] array, int[] result) {
        if(length < 1) return;
        result[array.length- length] = array[length - 1];
        doReverse(length-1, array, result);
    }
}
