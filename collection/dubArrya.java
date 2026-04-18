package collection;

public class dubArrya {
    public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5,4,6,7,3,1};

        for(int i = 0; i < arr.length; i++) {
            
            boolean already = false;

            for(int k = 0; k < i; k++) {
                if(arr[i] == arr[k]) {
                    already = true;
                    break;
                }
            }

            if(already) continue;

            int count = 0;
            System.out.print( arr[i] + " : ");
            for(int j = i; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    System.out.print(j + " ");
                }
            }

            if(count > 1) {
                System.out.println();
            } else {
                System.out.println();
            }
        }
    }
}