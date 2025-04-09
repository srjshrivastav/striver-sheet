package sortings;

import utils.Helper;

public class Main {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        Helper.printArray(Sort.selectionSort(arr));
    }
}
