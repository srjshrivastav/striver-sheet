package recursion;

import utils.Helper;

public class FibonacciNumber {
    
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printFibonacci(0, 1, n);
    }

    private static void printFibonacci(int first, int second, int n) {
        if(first == 0){
            System.out.print(first+" ");
        }
        if(first == 0 && second == 1 && n > 0){
            System.out.print(second+" ");
        }
        if(n==1 || n==0){
            return;
        }
        int next = first + second;
        System.out.print(next+" ");
        printFibonacci(second, next, --n);
    }
}
