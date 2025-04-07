package maths;

import utils.Helper;

public class Armstrong {
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        System.out.println(isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
        int sum = 0;
        int t = n;
        int pow = (int)Math.log10(t)+1;
        while(t>0){
            sum = sum + (int)Math.pow((t%10), pow) ;
            t/=10;
        }
        return sum==n;
    }
}
