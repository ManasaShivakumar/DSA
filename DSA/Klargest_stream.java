import java.util.*;

public class Klargest_stream {
    static PriorityQueue<Integer> min;
    static int k;
    public static List<Integer> get_kth_largest(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int val : arr){
            if(min.size() < k){
                min.add(val);
            }
            else{
                if(val > min.peek()){
                    min.poll();
                    min.add(val);
                }                
            }
            if(min.size() >= k){
                list.add(min.peek());
            }
            else{
                list.add(-1);
            }
        }
        return list;
    }
    public static void main(String[] args){
        min = new PriorityQueue<>();
        k = 3;
        int arr[] = {10, 20, 11, 70, 50, 40, 100, 5};
        System.out.println(get_kth_largest(arr));
    }
}
