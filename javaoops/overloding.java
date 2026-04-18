package javaoops;

public class overloding {
    public static void main(String[] args) {
        cal c = new cal();
        c.add(2,4);
        c.add(3,6,7);
    }
}

class cal{
    void add(int a , int b){
        System.out.println( a+b);
    }

    void add(int a , int b , int c){
        System.out.println(a+b+c);
    }
}
