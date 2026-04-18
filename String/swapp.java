package String;

public class swapp {
    public static void main(String[] args) {
        String s1 ="wakad";
        String s2 = "12345678";

        String res ="";

        int i =0;

        while(i< s1.length() && i<s2.length() ){
            res = res + s1.charAt(i) + s2.charAt(i);
            i++;
        }
        
        while(i< s2.length()){
            res = res + s2.charAt(i);
            i++;
        }
        System.out.print(res);

    }
}
