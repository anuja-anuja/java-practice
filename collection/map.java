package collection;

import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
         TreeMap<String, Integer> map = new TreeMap<>();

        map.put("pune", 12);
        map.put("mumbai", 1);
        map.put("satara", 13);

       for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }
    }
}
