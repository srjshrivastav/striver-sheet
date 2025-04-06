package maths;

import utils.Helper;

public class DigitCount {
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        countDigitBruteForceApproach(n);
        countDigitOptimized(n);
    }

    /**
     * TC: O(1)
     * @param n
     */
    private static void countDigitOptimized(int n) {
        System.out.println(((int)Math.log10(n))+1);
    }

    /**
     * TC: O(log10N)
     * @param n
     */
    private static void countDigitBruteForceApproach(int n) {
        int cnt = 0;
        while(n>0){
            cnt++;
            n/=10;
        }
        System.out.println(cnt);
    }
}
