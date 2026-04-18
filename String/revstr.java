package String;

public class revstr {
    public static void main(String[] args) {
        String str = "my name is anuja";
        String rev = "";
        for(int i=str.length()-1 ; i>=0 ;i--){
            char ch = str.charAt(i);
            rev = rev + ch ;
        }
        System.out.println(rev);
    }
}
