import java.util.PriorityQueue;
public class Connect_N_ropes {   
    public static void main(String[] args){
        int arr[] = {4, 3, 2, 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        
        int cost = 0;
        while (pq.size() > 1) {
            int currCost = pq.remove() + pq.remove();
            cost += currCost;
            pq.add(currCost);            
        }
        System.out.println("Min cost of connecting N ropes = "+cost);
    }    
}
