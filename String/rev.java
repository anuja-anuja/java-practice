package String;
public class rev {
    public static void main(String[] args) {
    String str ="my name is anuja";
    
    String[] words = str.split(" ");

    for(int i = 0 ; i<words.length ;i++){
        String word = words[i];
        if(i==0 || i==words.length-1){
            String rev ="";
            for(int j = word.length()-1 ;j>=0 ;j--){
                char ch = word.charAt(j);
                rev = rev +ch;
            }
        System.out.print(rev +" ");
        }
        else {
            System.out.print(word +" ");
        }
    }
}
}
