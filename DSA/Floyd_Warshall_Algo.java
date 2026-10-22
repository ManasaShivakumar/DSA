import java.util.*;
public class Floyd_Warshall_Algo {
    static class Edge {
        int src, dest, wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void creatGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 11));

        graph[1].add(new Edge(1, 2, 2));
        graph[1].add(new Edge(1, 3, 8));

        graph[2].add(new Edge(2, 3, 3));
    }
    
    final static int INF = (int)1e9;

    public static void floyd_Warshall(ArrayList<Edge>[] graph, int V){
        int[][] dist = new int[V][V];
        for(int i=0; i<V; i++){            
            for(int j=0; j<V; j++){  
                if(i == j){
                    dist[i][j] = 0;
                }     
                else{
                    dist[i][j] = INF;
                }              
            }
        }
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge e = graph[i].get(j);
                dist[e.src][e.dest] = e.wt;
            }
        }

        for(int k =0; k<V; k++){
            for(int i=0; i<V; i++){
                for(int j=0; j<V; j++){
                    if(dist[i][k] != INF && dist[k][j] != INF){
                        dist[i][j] = Math.min(dist[i][j], (dist[i][k] + dist[k][j]));
                    }                    
                }
            }
        }
        printSolulu(dist);
    }

    public static void printSolulu(int dist[][]){
        for(int i=0; i<dist.length; i++){
            for(int j=0; j<dist.length; j++){
                if(dist[i][j] == INF){
                    System.out.print("INF"+" ");
                }
                else{
                    System.out.print(" "+dist[i][j]+"  ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings ("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        creatGraph(graph);
        floyd_Warshall(graph, V);
    }
}
