import java.util.*;

public class Stack_deque {
    static class StackA{
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty(){
            return dq.isEmpty();
        }

        public void push(int data){
            dq.addLast(data);
        }

        public int pop(){
            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        StackA s = new StackA();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("top = "+s.peek());
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
