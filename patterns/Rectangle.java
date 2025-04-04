package patterns;

import utils.Helper;

public class Rectangle {

    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printRectangle(n);
    }

    private static void printRectangle(int n) {
       for(int index=0;index<n;index++){
        for(int indexI=0;indexI<n;indexI++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    
}
