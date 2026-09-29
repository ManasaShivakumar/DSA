import java.util.PriorityQueue;

public class Near_cars {
    static class Cars implements Comparable<Cars> {
        int x;
        int y;
        int distSq;
        int idx;
        public Cars(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override 
        public int compareTo(Cars c1){
            return this.distSq - c1.distSq;
        }
    }
    public static void main(String[] args){
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        PriorityQueue<Cars> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int distsq = (pts[i][0]*pts[i][0]) + (pts[i][1]*pts[i][1]) ;
            pq.add(new Cars(pts[i][0], pts[i][1], distsq, i));
        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);            
        }
    }
    
}
