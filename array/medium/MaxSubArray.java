package array.medium;

import utils.Helper;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        int[] result = findMaxSumSubArray(arr);
        Helper.printArray(result);
    }

    /**
     * Kadane's Algorithm
     * @param arr
     * @return
     */
    private static int[] findMaxSumSubArray(int[] arr) {
        
        int maxSum = arr[0];
        int sum = 0;
        int start = 0;
        int end = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum<0){
                sum=0;
                start=i+1;
                end = start; 
            }

            if(sum>maxSum){
                maxSum = sum;
                end=i;
            }
        }
        System.out.println(maxSum);
        System.out.println(start);
        System.out.println(end);
        return new int[]{};
    }
}
