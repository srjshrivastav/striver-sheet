package maths;

import java.util.ArrayList;
import java.util.List;

import utils.Helper;

public class PrintAllDivisiors {

    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        List<Integer> array = getAllDivisors(n);
        Helper.printList(array);
    }

    private static List<Integer> getAllDivisors(int n) {
        int sqrt = (int)Math.sqrt(n);
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=sqrt;i++){
            if(n%i==0){
                result.add(i);
                if(i != n/i){
                    result.add(n/i);
                }
            }
        }
        return result;
    }
}
