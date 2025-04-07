package maths;

import utils.Helper;

public class Prime {

    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        System.out.println("Given no. is Prime. "+ isPrime(n));
    }

    private static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2;i<=(int)Math.sqrt(n);i++){
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
}
