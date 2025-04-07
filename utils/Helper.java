package utils;

import java.util.List;
import java.util.Scanner;

public class Helper {
    private static Scanner sc = new Scanner(System.in);
    
    public static int getIntergerInput(){
        System.out.print("Enter an Integer ");
        int n = sc.nextInt();
        System.out.println("\n");
        return n;
    }

    public static void printList(List<Integer> array) {
        for(int i:array){
            System.out.print(i+", ");
        }
    }

    public static int[] takeArrayInput() {
        int n = getIntergerInput();
        int[] array  = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" ");
        }
    }
}
