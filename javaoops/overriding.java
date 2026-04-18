package javaoops;

public class overriding {
// static Animal an ;
    public static void main(String[] args) {
         Animal an ;
        an = new Cat();
        an.sound();
        an = new Dog();
        an.sound();
    }
}

class Animal {

    void sound(){
        System.out.println("depends on animal");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("dog barck");
    }
}

class Cat extends Animal {
    void sound(){
        System.out.println("cat sound mau-mau");
    }
}
