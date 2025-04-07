package recursion;

import utils.Helper;

public class RecursionBasic {
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printNTimes(n, "Suraj");
        System.out.println();
        print1ToN(1, n);
    }

    private static void printNTimes(int n, String string) {
        if(n==0) return;
        System.out.println(string);
        n--;
        printNTimes(n, string);
    }

    private static void print1ToN(int current, int n) {
        if(current > n) return;
        System.out.println(current);
        current ++;
        print1ToN(current, n);
    }
}
