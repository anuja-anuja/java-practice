package javaoops;

public class inhertance {
    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.sound();
        
    }
}

class Animal{
    void eat(){
        System.out.println("food");
    }
}

class cat extends Animal{

  void  sound(){
    System.out.println("cat mau-mau");
    }
}
