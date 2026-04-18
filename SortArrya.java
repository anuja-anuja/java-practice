package Array;

import javax.swing.plaf.synth.SynthStyle;

public class SortArrya {
    public static void main(String[] args) {
        int[] arr = {10,70,30,50,40,80,15};
        // int[] arr1 = {};
        int temp = 0 ;
        //70
        for(int i =0 ;i < arr.length ;i++){
            for(int j = 0 ; j< arr.length ;j++ ){
                if(arr[i]>arr[j+1]){
                    temp = arr[i];
                    arr[i]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
            System.out.print(temp+" ");
        }
    }
}
