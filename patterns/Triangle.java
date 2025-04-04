package patterns;

import utils.Helper;

public class Triangle {
    
    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printTriangle(n);
        System.out.println("\n");
        printNumberTiangle(n);
        System.out.println("\n");
        printSameNumberTiangle(n);
        System.out.println("\n");
        printReverseTiangle(n);
        System.out.println("\n");
        printReverseNumberTiangle(n);
        System.out.println("\n");
        printEqTiangle(n);
        System.out.println("\n");
        printReverseEqTiangle(n);
        System.out.println("\n");
        printRhombus(n);
    }

    private static void printRhombus(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n*2;j++){
                if(j>= n -i && j<= n+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            System.out.print(" ");
            for(int j=0;j<=n*2;j++){
                if(j>= n -i && j< n+i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printEqTiangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n*2;j++){
                if(j>= n -i && j<= n+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printReverseEqTiangle(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<=n*2;j++){
                if(j>= n -i && j< n+i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printReverseNumberTiangle(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    private static void printReverseTiangle(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
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

    private static void printSameNumberTiangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
