package recursion;

import utils.Helper;

public class Palindrome {
    public static void main(String[] args) {
        String input = Helper.getStringInput();
        System.out.println(isPalindrome(input, 0, input.length()-1));
    }

    private static boolean isPalindrome(String input, int start, int end) {
        if(end < start) return true;
        else if(input.charAt(start) == input.charAt(end)) return isPalindrome(input, start+1, end-1);
        return false;
    }
}
