import java.util.*;
public class Min_timeFill_Nslot {
    public static void minTime(int arr[], int N, int k){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[N+1];
        int time = 0;
        for(int i=0; i<k; i++){
            q.add(arr[i]);
            vis[arr[i]] = true;
        }
        while (!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++){
                int curr = q.poll();
                if(curr - 1 >= 1 && !vis[curr-1]){
                    q.add(curr-1);
                    vis[curr-1] = true;
                }
                if(curr + 1 <= N && !vis[curr + 1]){
                    q.add(curr + 1);
                    vis[curr + 1] = true;
                }
            }
            time++;            
        }
        System.out.print("min Time = "+(time-1));
    }
    public static void main(String[] args){
        int N = 6;
        int arr[] = {2, 6};
        int K = arr.length;
        minTime(arr, N, K);
    }
    
}
