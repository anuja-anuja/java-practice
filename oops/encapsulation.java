package oops;

class Pune  {
    private int id = 13;

    public int getid() {
        return id ;
    }
    
}

public class  encapsulation extends Pune {

    // private int id = 12;
    private String name = "anuja" ;
    
    public int getid() {
        
        return super.getid();
        
    }
    public String getName(){
        return name ;
    }


    
    public static void main(String[] args) {
        encapsulation es = new encapsulation();

        System.out.println(es.getid());
        System.out.println(es.getName());

    }
}
