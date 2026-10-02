import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 150);
        map.put("Srilanka", 50);
        map.put("Indonesia", 500);
        map.put("China", 200);
        
        // System.out.println(map);
        // System.out.println(map.get("USA"));
        // System.out.println(map.get("canada"));
        // System.out.println(map.containsKey("Srilanka"));
        // System.out.println("removed "+map.remove("Srilanka"));
        // System.out.println(map);
        // System.out.println(map.remove("Dubai"));
        // System.out.println(map.size());
        // map.clear();
        // System.out.println(map.isEmpty());
        
        System.out.println(map.entrySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            
        }
        // Set<String> keys = map.keySet();
        // System.out.println(keys);
        // for (String k : keys) {
        //     System.out.println(k+" : "+map.get(k));
        // }
        
    }
}
