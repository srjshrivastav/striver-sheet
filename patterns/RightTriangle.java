package patterns;

import utils.Helper;

public class RightTriangle {
    
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printTriangle(n);
        System.out.println("\n");
        printNumberTiangle(n);
    }

    private static void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printNumberTiangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
