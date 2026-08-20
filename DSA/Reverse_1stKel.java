import java.util.*;
public class Reverse_1stKel {
    public static void reverse_1stKelements(Queue<Integer> q, int k){
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        for(int i=0; i<k; i++){
            s.push(q.remove());           
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i=0; i<(size-k); i++){
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverse_1stKelements(q, 5);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }    
}
