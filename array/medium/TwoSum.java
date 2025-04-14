package array.medium;

import sortings.Sort;
import utils.Helper;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        int k = Helper.getIntergerInput();
        Helper.printArray(solve2Sum(k, arr));
    }

    private static int[] solve2Sum(int k, int[] arr) {
        Sort.quickSort(arr);
        int[] result = {-1, -1};
        int sum = 0;
        for(int i=0, j = arr.length-1;i<j;){
            sum = arr[i] + arr[j];
            if(sum < k){
                i++;
            }
            else if(sum > k){
                j--;
            }else{
                result[0]=arr[i];
                result[1]=arr[j];
                break;
            }
        }
        return result;
    }
}
