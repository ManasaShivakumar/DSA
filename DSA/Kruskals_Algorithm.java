import java.util.*;
public class Kruskals_Algorithm {
    static class Edge {
        int src, dest, wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void creatGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }
    
    static int n = 4;
    static int par[];
    static int rank[];

    public static void init(){       
        rank = new int[n];
        par = new int[n];
        for(int i=0; i<n; i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(x == par[x]){
            return x;
        }

        return par[x] = find(par[x]); //path compression
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }
        else {
            par[parB] = parA;
        }
    }

    public static int kruskals_Algo(ArrayList<Edge> edges, int v){
        init();
        Collections.sort(edges, Comparator.comparingInt(e->e.wt));
        int finalcost = 0;
        int count = 0;
        for(int i=0; count<v-1; i++){
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if(parA != parB){
                union(e.src, e.dest);
                finalcost += e.wt;
                count++;
            }
        }
        return finalcost;
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        creatGraph(edges);
        System.out.println(kruskals_Algo(edges, v));
    }    
}
