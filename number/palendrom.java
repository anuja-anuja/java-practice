package number;
public class palendrom {
    public static void main(String[] args) {
        int n1 = 12321;
        int temp = n1;
        int rev = 0;

        while(n1!=0){
           int rem = n1%10;
           rev = rev *10 + rem ;
           n1 = n1/10;
        }
        if(temp ==rev){
            System.out.print("palendrom");
        }
        else{
            System.out.println("not palendrom"+" " +rev);
        }
    }
}
