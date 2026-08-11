import java.util.Stack;
public class Stack_trappingRW {
    public static int total_trappedWater(int h[]){
        Stack<Integer> s = new Stack<>();
        int total_tw = 0;
        for(int i=0; i<h.length; i++){
            while(!s.isEmpty() && h[s.peek()] < h[i]){
                int currH = h[s.peek()];
                s.pop();
                
                if(s.isEmpty()){
                    break;
                }

                int distance = i- s.peek() - 1;
                int min_H = (Math.min(h[i], h[s.peek()])) - currH;
                int tw = distance * min_H;
                total_tw += tw; 
            }
            s.push(i);
        }
        return total_tw;
    }
    public static void main(String[] args) {
        int h[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println("Total trapped water = "+total_trappedWater(h));
    }    
}
