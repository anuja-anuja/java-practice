package String;

public class swappp {
    public static void main(String[] args) {
        String s1 ="wakad";
        String s2 = "12345678";
        String res = "";

      int max = Math.max(s1.length(), s2.length());

        for(int i = 0;i<max ; i++){
            if(i<s1.length()){
                res = res + s1.charAt(i);
            }
            if(i<s2.length()){
                res = res + s2.charAt(i);
            }
        }
        System.out.print(res);
    }
}
