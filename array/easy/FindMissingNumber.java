package array.easy;

import utils.Helper;

public class FindMissingNumber {
    public static void main(String[] args) {
        int number = Helper.getIntergerInput();
        int[] arr = Helper.takeArrayInput();
        System.out.println(findMissing(number, arr));
    }

    private static int findMissing(int number, int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int totalSum = (number *(number+1))/2;
        return totalSum - sum;
    }
}
