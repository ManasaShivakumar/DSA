import java.util.*;
public class CheapestFlight_Kstops {
    static class Edge{
        int src, dest, wt;
        public Edge(int s, int d, int  w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void creatGraph(int[][] flights, ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<flights.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            graph[src].add(new Edge(src, dest, wt));
        }
    }

    static class Info{
        int v, price , stops;
        public Info(int v, int p, int stops){
            this.v = v;
            this.price = p;
            this.stops = stops;
        }
    }
    public static int cheapest_flights(int n, int[][] flights, int src, int dst, int k){
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[n];
        creatGraph(flights, graph);
        
        int dist[] = new int[n];
        for(int i=0; i< n; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }

            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);                
                int v = e.dest;
                int w = e.wt;
                if(curr.price + w < dist[v] && curr.stops <= k){
                    dist[v] = curr.price + w;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }

        if(dist[dst] == Integer.MAX_VALUE){
            return -1;
        }

        return dist[dst];
    }
    public static void main(String[] args){
        int n = 5;
        int flights[][] = {{4,1,1},{1,2,3},{0,3,2},{0,4,10},{3,1,1},{1,4,3}};
        int src = 2, dst = 1, k = 1;
        System.out.println(cheapest_flights(n, flights, src, dst, k));
    } 
}
 