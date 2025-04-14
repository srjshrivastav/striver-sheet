package array.medium;

import utils.Helper;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        System.out.println(getWinner(arr));
    }

    private static int getWinner(int[] arr) {
        int count = 0;
        int el = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                count++;
            }else{
                count--;
            }
            //Now this elememt is the winner
            if(count==0){
                el = arr[i];
                count=1;
            }
        }
        return el;
    }
}
