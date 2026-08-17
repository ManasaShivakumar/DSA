import java.util.*;
public class Queues {
    static class Arr_Queue {
        static int arr[];        
        static  int size;
        static int rear;
        
        public Arr_Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i < rear; i++){
                arr[i] = arr[i+1];                
            }
            rear = rear - 1;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }    
    }
    static class Circular_Queue{
        static int arr[];        
        static  int size;
        static int rear;
        static int front;
        
        public Circular_Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public boolean isFull(){
            return (rear+1) % size == front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size; 
            }                      
            return val;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }    
    }
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LL_Queue{
        static Node head;
        static Node tail;

        public boolean isEmpty(){
            return head == null;
        }

        public void enqueue(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.data;
            if(tail == head){
                head = tail = null;
            }
            else {
                head = head.next;
            }            
            return val;
        }

        public int front(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // Arr_Queue q = new Arr_Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        // Circular_Queue q = new Circular_Queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);
        // System.out.println("removed ->"+q.remove());
        // q.add(6);
        // System.out.println("removed ->"+q.remove());
        // q.add(7);
        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();
        // }       

        // LL_Queue q = new LL_Queue();
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        // q.enqueue(5);
        // q.dequeue();
        // q.enqueue(6);
        // q.dequeue();
        // while(!q.isEmpty()){
        //     System.out.println(q.front());
        //     q.dequeue();
        // }
        // System.out.println(q.front());

        Queue<Integer> q = new LinkedList<>();
        Queue<Character> q2 = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q2.add('a');
        q2.add('b');
        q2.add('c');
        while(!q2.isEmpty()){
            System.out.println(q2.peek());
            q2.remove();
        }
    }    
}
