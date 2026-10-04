import java.util.*;
public class Sort_by_freq {
    public static String freqSort(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a,b)->b.getValue() - a.getValue());                                                           
        
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            pq.add(e);
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll().getKey();
            int freq = map.get(ch);
            while (freq != 0) {
                sb.append(ch);
                freq--;
            }            
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "pool";
        System.out.println(freqSort(s));
    }    
}
