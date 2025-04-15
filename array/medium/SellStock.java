package array.medium;

import utils.Helper;

public class SellStock {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        System.out.println(findMaxProfit(arr));
    }

    private static int findMaxProfit(int[] arr) {
        int maxPro = 0;
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min = i;
            }else{
               if(i-min>maxPro){
                    maxPro = i-min;
               }     
            }
        }
        return maxPro;
    }
}
