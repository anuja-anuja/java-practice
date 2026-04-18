package pattern;

public class Number {
    public static void main(String[] args) {
        int m = 5;
        int n = 1;
        for(int i=1; i<=m; i++)
        {
          for(int j=m-i ; j>=1 ;j--){
            System.out.print(" ");
          }
          for(int k= 1; k<=i ;k++ ){
            System.out.print(n+" ");
            n++;
          }
           System.out.println();
        }
       
    }
}