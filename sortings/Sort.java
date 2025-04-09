package sortings;

public class Sort {
    
    public static int[] selectionSort(int[] arr){
        int minIndex = 0, temp;
        for(int i=0;i<arr.length;i++){
            minIndex = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
