package javaoops;
 class encapsulation {
        private int id  ;
        private String proName;
        private double price;

        encapsulation(int id , String proName , double price){
            this.id = id;
            this.proName = proName;
            this.price = price;
        }

        public int getId(){
            return id ;
        }

        public String getProName(){
            return proName;
        }
        public double getPrice(){
            return price;
        }

        public void setId(int id){
            this.id = id;
        }
public class Test{
       public static void main(String[] args){
        encapsulation en = new encapsulation(01 , "mobile", 100000);

        System.out.println("id = " + en.getId());
        en.setId(02);
        System.out.println("name = " + en.getProName());
        System.out.println("price = " + en.getPrice());
        System.out.println("id = " + en.getId());

        
        }
    }
}