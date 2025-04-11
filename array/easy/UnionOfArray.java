package array.easy;

import utils.Helper;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = Helper.takeArrayInput();
        int[] arr2 = Helper.takeArrayInput();
        int[] result = union(arr1, arr2);
        Helper.printArray(result);
    }

    private static int[] union(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[m+n];
        int i=0,j=0;
        int start=0;
        while(i < n && j < m){
            if(arr1[i]<arr2[j]){
                result[start++]=arr1[i];
                i++;
            }else if(arr1[i]==arr2[j]){
                result[start++]=arr1[i];
                i++;
                j++;
            }else{
                result[start++]=arr2[j];
                j++;
            }

            while(i+1<n && arr1[i]==arr1[i+1]){
                i++;
            }
            while(j+1<m && arr2[j]==arr2[j+1]){
                j++;
            }
        }
        while(i<n){
            result[start++]=arr1[i];
            i++;
        }
        while(j<m){
            result[start++]=arr2[j];
            j++;
        }
        return result;
    }
}
