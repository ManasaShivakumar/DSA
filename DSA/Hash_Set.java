import java.util.*;
public class Hash_Set {
    public static void main(String[] args) {
        // HashSet<Integer> hset = new HashSet<>();
        // hset.add(1);
        // hset.add(5);
        // hset.add(2);
        // hset.add(8);
        // hset.add(1);
        // hset.add(2);        
        // System.out.println(hset);
        // hset.remove(8);
        // System.out.println(hset.contains(8));
        // System.out.println(hset.size());
        // hset.clear();
        // System.out.println(hset.isEmpty());

        HashSet<String> cities = new HashSet<>();
        cities.add("Banglur");
        cities.add("Delhi");
        cities.add("Manglur");
        cities.add("Coorg");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());            
        // }

        // for(String k : cities){
        //     System.out.println(k);
        // }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Banglur");
        lhs.add("Delhi");
        lhs.add("Manglur");
        lhs.add("Coorg");

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Banglur");
        ts.add("Delhi");
        ts.add("Manglur");
        ts.add("Coorg");

        System.out.println(cities);
        System.out.println(lhs);
        System.out.println(ts);
    }    
}
