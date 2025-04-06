package maths;

import utils.Helper;

public class Palindrome {

    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        return RevNumber.rev(n) == n;
    }
}