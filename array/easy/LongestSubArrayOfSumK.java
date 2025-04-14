package array.easy;

import utils.Helper;

public class LongestSubArrayOfSumK {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        int k = Helper.getIntergerInput();
        System.out.println(lengthOfLongestSubArrOfSum(k, arr));
    }

    private static int lengthOfLongestSubArrOfSum(int k, int[] arr) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        
        while(right < arr.length){
            while (right < arr.length && sum<k) {
                sum+=arr[right++];
            }
            if(sum == k && ((right - left) +1) > maxLen){
                maxLen = right-left;
            }
            if(sum>=k){
                sum-=arr[left];
            }
            left++;
        }
        return maxLen;
    }
}
