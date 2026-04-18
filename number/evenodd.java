package number;
public class evenodd {
    public static void main(String[] args){
        int num = 100;
        System.out.println("Enter the evwen number");
        for(int i =1;i<=num ;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("enetr the odd number");
        for(int i= 1;i<=num ;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
