package sortings;

public class Sort {
    
    /**
     * Choose one at a time and swap with current index
     * @param arr
     * @return
     */
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

    /**
     * Sort Array from Last index i.e largest number at last first
     * Swap every adjacent element
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        int temp;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Insertion Sort: Set the current Element to Index I and swap the left elements till its right position
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr){
        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                        temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
