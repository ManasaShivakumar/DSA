import java.util.ArrayList;

public class Graph_Detect_Cycle {
    static class Edge {
        int src, dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }        
    }
    
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 3));

        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 1));

        // graph[3].add(new Edge(3, 0));
        // graph[3].add(new Edge(3, 4));

        graph[0].add(new Edge(0, 2));
        //graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean un_detectCycle(ArrayList<Edge>[] graph){//O(V+E)
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(un_detectCycleUtil(graph, i, vis, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean un_detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, int par){
        vis[curr] = true;        

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //case-3
            if(!vis[e.dest]){
                if(un_detectCycleUtil(graph, e.dest, vis, curr)){
                    return true;
                }
            }
            //case-1
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
            //case-2 -> do nothing -> continue
        }
        return false;
    }

    public static boolean di_detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(di_detectCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean di_detectCycleUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, boolean[] stack){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && di_detectCycleUtil(graph, e.dest, vis, stack)){
               return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args){
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(di_detectCycle(graph));
    }

}
