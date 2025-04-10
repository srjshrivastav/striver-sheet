package array.easy;

import utils.Helper;

public class LargestElement {
    
    public static void main(String[] args) {
        int[] arr = Helper.takeArrayInput();
        try {
            System.out.println("Largest :"+ findMax(arr));
            System.out.println("Second Largest : "+findSecMax(arr));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    private static int findSecMax(int[] arr) throws Exception {
        int max, sMax;
        if(arr.length == 0){
           throw new Exception("Should not be less than 1");
        }else{
            max = arr[0];
            sMax = arr[0];
            for(int i:arr){
                if(i>max){
                    sMax = max;
                    max=i;
                }
            }
        }
        return sMax;
    }

    private static int findMax(int[] arr) throws Exception {
        int max;
        if(arr.length == 0){
           throw new Exception("Should not be less than 1");
        }else{
            max = arr[0];
            for(int i:arr){
                if(i>max){
                    max=i;
                }
            }
        }
        return max;
    }
}
