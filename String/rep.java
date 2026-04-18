package String;

public class rep {
    public static void main(String[] args) {

        String str = "I am good at coding";
        String target = "good";
        String replacement = "excellent";

        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            
            // Check if substring matches "good"
            if (i <= str.length() - target.length() &&
                str.substring(i, i + target.length()).equals(target)) {
                
                result += replacement;
                i += target.length() - 1; // skip "good"
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
   

   
