package maths;

import utils.Helper;

public class GCD {
    public static void main(String[] args) {
        int first = Helper.getIntergerInput();
        // System.out.println("Second");
        int second = Helper.getIntergerInput();
        System.out.println("GCD or HCF is :"+withoutRecursionGCD(first,second));
    }

    private static int findGcd(int first, int second) {
        int rem = 0;
        if(second == 0){
            return first;
        }
        else if(first == 0){
            return second;
        }
        else if(first >= second){
            rem = first%second;
            return findGcd(second, rem);
        }else{
            rem = second%first;
            return findGcd(first, rem);
        }
    }

    private static int withoutRecursionGCD(int first, int second) {
        while(first>0 && second >0){
            if(first>second){
                first = first%second;
            }else{
                second = second%first;
            }
        }
        if(first == 0) return second;
        return first;
    }
    
}
