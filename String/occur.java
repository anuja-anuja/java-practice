package String;
public class occur {
    public static void main(String[] args) {
        String str ="anuja";

        for(int i = 0;i< str.length() ;i++){
            int count = 1;
            boolean flag = false;
            for(int k = 0 ;k<i ;k++){
                if(str.charAt(i)==str.charAt(k)){
                    flag = true;
                }
            }
            if(flag == true){
                continue;
            }
            for(int j = i+1 ;j< str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i)+"="+count );
        }
    }
}