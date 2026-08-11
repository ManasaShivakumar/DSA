import java.util.Stack;
public class MaxArea_histogram {
    public static void findLargest_rect(int h[]){
        int maxarea = 0;
        int nsl[] = new int[h.length];
        int nsr[] = new int[h.length];

        Stack<Integer> s = new Stack<>();
        //next smallest right
        for(int i=h.length-1; i>=0; i--){
            while(!s.isEmpty() && h[s.peek()] >= h[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = h.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smallest left
        s = new Stack<>();
        for(int i=0; i<h.length; i++){
            while(!s.isEmpty() && h[s.peek()] >= h[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //area width = j-i-1 -> width = nsr[i]-nsl[i]-1
        for(int i=0; i<h.length; i++){
            int width = nsr[i]-nsl[i]-1;
            int currAr = h[i]*width;
            maxarea = Math.max(currAr, maxarea); 
        }

        // for(int i=0; i<nsr.length; i++){
        //     System.out.print(nsr[i]+" ");
        // }
        // System.out.println();
        // for(int i=0; i<nsl.length; i++){
        //     System.out.print(nsl[i]+" ");
        // }
        // System.out.println();

        System.out.println("Maximum area in histogram = "+maxarea);
    }
    public static void main(String[] args) {
        int h[] = {2,1,5,6,2,3};
        findLargest_rect(h);
    }    
}
