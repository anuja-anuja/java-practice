package number;
public class fibono {
    public static void main(String[] args) {
        int num = 10 , a= 0 , b=1;
        for(int i=2; i<=num ;i++){
            int c= a+b;
            System.out.print(" " + c +" ");
            a=b;
            b=c;
        }
    }
}