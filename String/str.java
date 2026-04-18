package String;

public class str {
    public static void main(String[] args) {
        String str = "my name is tnuja";
        String[] words = str.split(" ");

        for(String word : words){
            for(int i = 0 ;i<word.length();i++){
                char ch = word.charAt(0);
                char temp = word.charAt(word.length()-1);
            
                if(i==0){

                    System.out.print(temp);
                }
                if(i==word.length()-1){

                    System.out.print(ch+" ");
                }
                if(i>0 && i< word.length()-1){
                    System.out.print(word.charAt(i));
                }
            }
        }
    }
}

