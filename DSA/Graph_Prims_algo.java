import java.util.*;
public class Graph_Prims_algo {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair {
        int v, cost, par;
        public Pair(int v, int cost, int par){//if in question asked to print mst then only store the parent if not then only store vertex and cost
            this.v = v;
            this.cost = cost;
            this.par = par;
        }
    }
    public static void primsMST(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.cost - b.cost);
        pq.add(new Pair(0, 0, -1));
        int finalCost = 0;
        ArrayList<Edge> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost += curr.cost;
                if(curr.par != -1){
                    ans.add(new Edge(curr.par, curr.v, curr.cost));
                }
                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    
                    pq.add(new Pair(e.dest, e.wt, curr.v));
                }
            }
        }

        System.out.println("min cost = "+finalCost);
        for(int i=0; i<ans.size(); i++){
            System.out.println("("+ans.get(i).src+" , "+ans.get(i).dest+" , "+ans.get(i).wt+")");
        }
        
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        creatGraph(graph);
        primsMST(graph);
    }    
}
