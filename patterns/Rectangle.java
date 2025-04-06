package patterns;

import utils.Helper;

public class Rectangle {

    public static void main(String[] args) {
        int n = Helper.getIntergerInput();
        printRectangle(n);
        System.out.println("\n");
        printRectangleWithSpaceBetween(n);
    }

    private static void printRectangleWithSpaceBetween(int n) {
        StringBuilder sb=new StringBuilder();
        for(int i= 0;i<(n*2)-1;i++){
            sb.setLength(0);
            for(int j=0;j<n;j++){
                if(i%2 != 0){
                    sb.append(" ");
                }else{
                    if(i==0 || i==(n*2)-2 || j==0 || j == n-1){
                        sb.append("*");
                    }else{
                        sb.append(" ");
                    }
                }
            }
            System.out.println(sb.toString());
        }
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
