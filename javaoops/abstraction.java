package javaoops;

class abstraction {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.type();
        v.capacity();
        v.name();
        v.starts();
        System.out.println("-------------------------------");
        Car c = (Car) v;
        c.capacity();
        c.airbag();
        c.type();
        c.name();
        c.starts();
    }
}
    abstract class Vehicle{
         
       abstract void type();
       abstract void name();
       abstract void capacity();
       abstract void starts();
        
    }

    class Car extends Vehicle{

      void  type(){
        System.out.println("sports car");
        }
        void name(){
            System.out.println("farari");
        }
        void capacity(){
            System.out.println("4 members");
        }
        void starts(){
            System.out.println("on starter");
        }
        void airbag(){
            System.out.println("4 airbag");
        }
    }
    class Bike extends Vehicle{
         void  type(){
        System.out.println("sports bike");
        }
        void name(){
            System.out.println("ninja");
        }
        void capacity(){
            System.out.println("2 members");
        }
        void starts(){
            System.out.println("on keyck");
        }
    }




