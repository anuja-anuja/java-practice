package pattern;

public class pascal {
    public static void main(String[] args) {
        int n = 4;

        for(int i =1 ;i<=n ;i++){
            for(int j =n-i ;j>=0 ;j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=i ;k++){
                System.out.print(k);
            }
            for(int m = i-1 ; m>=1 ;m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
