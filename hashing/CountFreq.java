package hashing;

import java.util.HashMap;
import java.util.Map;

import utils.Helper;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        countFreq(arr);
    }

    private static void countFreq(int[] arr) {
       Map<Integer, Integer> freqMap = new HashMap<>();
       
       for(int i:arr){
            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
       }
       int low = arr[0], lowFreq = freqMap.get(arr[0]);
       int high = arr[0], highFreq = freqMap.get(arr[0]);
       for(int i: freqMap.keySet()){
            System.out.println(i +"-->"+freqMap.get(i));
            if(freqMap.get(i) < lowFreq){
                low = i;
                lowFreq = freqMap.get(i);
            }
            if(freqMap.get(i)> highFreq){
                high = i;
                highFreq = freqMap.get(i);
            }
       }
       System.out.println("Low->"+low);
       System.out.println("High->"+high);
    }
}
