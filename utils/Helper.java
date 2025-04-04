package utils;

import java.util.Scanner;

public class Helper {
    
    public static int getIntergerInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = sc.nextInt();
        sc.close();
        return n;
    }
}
