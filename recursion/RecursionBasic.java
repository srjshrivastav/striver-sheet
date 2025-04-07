package recursion;

import utils.Helper;

public class RecursionBasic {
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printNTimes(n, "Suraj");
        System.out.println();
        print1ToN(1, n);
        System.out.println();
        printNTo1(n);
        sumOfN(0, n);
        System.out.println("Factorial of "+n +" is: "+ fact(n));
    }

    private static int fact(int n) {
        if(n==0 || n==1){
            return n;
        }
        return n * fact(--n);
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

    private static void printNTo1(int n) {
        if(n == 0) return;
        System.out.println(n);
        n--;
        printNTo1(n);
    }

    private static void sumOfN(int sum, int n) {
        if(n == 0) {
            System.out.println("Sum of N numbers: " + sum);
            return;
        }
        sum =  sum + n;
        n--;
        sumOfN(sum, n);
    }
}
