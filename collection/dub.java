package collection;


public class dub {
    
    public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5,4,6,7,3,1};
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            int k = 0;
            for(int j = i ;j< arr.length ;j++){
                if(arr[i]==arr[j]){
                    count++;
                k = j;
                }
            }
            if(count>1){
                System.out.println(arr[i] + ": " + i +" "+k);
            }
        }
    }
}
