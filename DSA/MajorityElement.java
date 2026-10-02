import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 3, 1, 3};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i], (map.get(arr[i])+1));
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int n = arr.length;

        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            if(map.get(k) > (n/3)){
                System.out.print(k+" ");
            }            
        }
    }    
}
