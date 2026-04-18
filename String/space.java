package String;

public class space {
    public static void main(String[] args) {
        String str = "my name is anuja";
        char[] ch = str.toCharArray();

        int i = 0 ;
        int j = str.length()-1;

        while(i<j){
            if(ch[i]==' '){
                i++;
            }
            else if(ch[j]==' '){
                j--;
            } else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(ch));
    }
}


