package array.medium;

import java.util.ArrayList;
import java.util.Collections;

import utils.Helper;

public class RearrangeArrayElements {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        ArrayList<Integer> ans = reArrangeAlternate(arr);
        System.out.println(ans);
    }

    private static ArrayList<Integer> reArrangeAlternate(int[] arr) {

       ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 0));
        int posIndex = 0;
        int negIndex = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans.set(negIndex, arr[i]);
                // Helper.swap2Number(arr, negIndex, i);
                negIndex+=2;
            }else{
                // Helper.swap2Number(arr, posIndex, i);
                ans.set(posIndex, arr[i]); //Replace existing element which 0 initially
                posIndex+=2;
            }
        }
        return ans;
    }
}
