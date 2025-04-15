package array.medium;

import utils.Helper;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        int maxSum = findMaxSumSubArray(arr);
        System.out.println(maxSum);
    }

    /**
     * Kadane's Algorithm
     * @param arr
     * @return
     */
    private static int findMaxSumSubArray(int[] arr) {
        
        int maxSum = arr[0];
        int sum = 0;
        int ansStart = 0;
        int ansEnd = 0;
        int start = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum<0){
                sum=0;
                start=i+1; 
            }

            if(sum>maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
        }
        Helper.printArray(arr, ansStart, ansEnd+1);
        return maxSum;
    }
}
