package array.easy;

import utils.Helper;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        System.out.println(getMaxConsOnes(arr));
    }

    private static int getMaxConsOnes(int[] arr) {
        int currCount = 0;
        int maxCount = currCount;
        for (int i : arr) {
            if (i == 1) {
                currCount++;
            } else {
                if (maxCount < currCount) {
                    maxCount = currCount;
                }
                currCount = 0;
            }
        }
        if(currCount> maxCount) maxCount = currCount;
        return maxCount;
    }
}
