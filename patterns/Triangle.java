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
        System.out.println("\n");
        printEqTriangleRotated(n);
        System.out.println("\n");
        printRightTriangleAlternate(n);
        System.out.println("\n");
        printMShape(n);
        System.out.println("\n");
        printTriangleWithContinousNumber(n);
        System.out.println("\n");
        printSimpleCharTriangle(n);
        System.out.println("\n");
        printSimpleSameCharInRowTriangle(n);
        System.out.println("\n");
        printSimpleRevCharTriangle(n);
        System.out.println("\n");
        printSimpleTriangleWithRevCharOrder(n);
    }


    private static void printTriangleWithContinousNumber(int n) {
        int k = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.setLength(0);
            for(int j=1;j<=i;j++){
                sb.append(k++);
                if(j < i) //won't add extra space at end
                    sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void printSimpleCharTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Create a character array of size i + 1
            char[] chars = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                chars[j] = (char) ('A' + j);
            }
            // Print the characters as a string
            System.out.println(new String(chars));
        }
    }

    private static void printSimpleSameCharInRowTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Create a character array of size i + 1
            char[] chars = new char[i + 1];
            char c = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                chars[j] = c;
            }
            // Print the characters as a string
            System.out.println(new String(chars));
        }
    }

    private static void printSimpleTriangleWithRevCharOrder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            for (int j = 0; j <= i; j++) {
                sb.append((char) ('A' + n - i + j - 1));
                if(j < n) sb.append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    private static void printSimpleRevCharTriangle(int n) {
        for (int i = n; i > 0; i--) {
            // Create a character array of size i + 1
            char[] chars = new char[i + 1];
            for (int j = 0; j < i; j++) {
                chars[j] = (char) ('A' + j);
            }
            // Print the characters as a string
            System.out.println(new String(chars));
        }
    }

    private static void printMShape(int n) {
        StringBuilder sb = new StringBuilder();// Using string builder for optimization purpose
        for(int i=n;i>0;i--){
            sb.setLength(0);
            for(int j=1;j<=n*2;j++){
                if(j> n-i +1 && j < n+i){
                    sb.append(" ");
                }else{
                    if(j<=n)
                        sb.append(j);
                    else
                        sb.append((n*2)-j+1);  
                }
            }
            System.out.println(sb.toString());
        }
    }

    private static void printRightTriangleAlternate(int n) {
        boolean one = true;
        for(int i=0;i<n;i++){
            one = i%2==0;
            for(int j=0;j<=i;j++){
                    if(one)
                        System.out.print(1);
                    else
                        System.out.print(0);
                    one = !one;
            }
            System.out.println();
        }
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


    private static void printEqTriangleRotated(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
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
