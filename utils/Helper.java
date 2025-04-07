package utils;

import java.util.Scanner;

public class Helper {
    
    public static int getIntergerInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer ");
        int n = sc.nextInt();
        System.out.println("\n");
        return n;
    }
}
