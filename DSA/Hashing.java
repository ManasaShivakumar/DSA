import java.util.HashMap;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("USA", 150);
        map.put("Srilanka", 50);
        
        System.out.println(map);

        System.out.println(map.get("USA"));
        System.out.println(map.get("canada"));

        System.out.println(map.containsKey("Srilanka"));
        System.out.println("removed "+map.remove("Srilanka"));
        System.out.println(map);
        System.out.println(map.remove("Dubai"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());

    }
}
