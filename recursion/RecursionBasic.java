package recursion;

import utils.Helper;

public class RecursionBasic {
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printNTimes(n, "Suraj");
    }

    private static void printNTimes(int n, String string) {
        if(n==0) return;
        System.out.println(string);
        n--;
        printNTimes(n, string);
    }
}
