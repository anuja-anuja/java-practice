package String;

public class revString {
    public static void main(String[] args) {
        String str = "my name is anuja";

        String[] words = str.split(" ");
        for(String word : words ){
             String rev = "";
            for(int i = word.length()-1 ; i>=0 ;i--){
                char ch = word.charAt(i);
                rev = rev + ch;
            }
         System.out.print(rev+" ");
        }
    }
}
