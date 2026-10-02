import java.util.*;
public class LinkedHMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
        lmap.put("India", 100);
        lmap.put("America", 20);
        lmap.put("canada", 206);         
        System.out.println(lmap);              
    }    
}
