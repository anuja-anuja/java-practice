package Array;

public class SecondoMax {
    public static void main(String[] args) {
        int [] arr =  {10,40,20,60,30,70};

        int max = 0;
        int max2 = 0;

        for(int i =0;i<arr.length ; i++){
            if(max<arr[i]){
               max=arr[i];
            }
        }
        for(int j = 0 ;j< arr.length ;j++)
            if(arr[j]>max2 && arr[j]!= max){
                max2 = arr[j];
            }
        System.out.println("max: "+max);
        System.out.println("max2 : " + max2);
    }
}
