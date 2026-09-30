import java.util.Collections;
import java.util.PriorityQueue;

public class MinOpr_halfarrSum {
    public static int minOpr(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<arr.length; i++){
            pq.add((double)arr[i]);
        }

        double temp = sum;
        int count = 0;
        while (temp > (sum/2)) {
            double x = pq.poll();            
            temp -= (x/2);
            pq.add(x/2);
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {1, 5, 8, 19};
        System.out.println("Mininmum operations = "+minOpr(arr));
    }    
}
