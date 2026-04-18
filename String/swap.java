package String;

public class swap {
    public static void main(String[] args) {
        
    String s1 = "wakad";
    String s2 ="12345";
    String res = "";

    for(int i =0  ;i<s1.length()  ; i++   ){
        char ch = s1.charAt(i);
        char ch2 = s2.charAt(i); 
         res = res + ch +ch2;
    }
    System.out.print(res);
}
}
