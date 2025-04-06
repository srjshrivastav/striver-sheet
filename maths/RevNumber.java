package maths;

import utils.Helper;

public class RevNumber {
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        System.out.println(rev(n));
    }

    public static int rev(int n){
        int rev = 0;
        while(n>0){
            rev = (rev*10) + n%10;
            n/=10;
        }
        return rev;
    }
}
