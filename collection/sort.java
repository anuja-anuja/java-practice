package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sort {
    public static void main(String[] args) {
        Map<String,Integer> f = new HashMap<>();
        f.put( "manago" , 10);
        f.put("Apple" , 20);
        f.put("Orange" ,15);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(f.entrySet());

        list.sort(Map.Entry.comparingByValue());

        //Collections.sort(list, (a,b) -> a.getValue().compareTo(b.getValue()));
        //Collection.sort(list , (a,b) -> a.getValue() - b.getValue());

    
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
    }
}
}
