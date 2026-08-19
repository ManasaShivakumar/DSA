import java.util.*;

public class Queue_deque {
    static class QueueA{
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            return dq.removeFirst();
        }

        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("first el = "+q.peek());
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    
}
