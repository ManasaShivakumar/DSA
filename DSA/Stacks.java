import java.util.Stack;
public class Stacks {
    // static class ALstack {
    //     static ArrayList<Integer> list = new ArrayList<>();

    //     public boolean isEmpty(){
    //         return list.size() == 0;
    //     }

    //     public void push(int data){
    //         list.add(data);
    //     }

    //     public int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }

    //     public int peek(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size()-1);
    //     }
    // }
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    // static class LLstack {
    //     static Node head = null;

    //     public boolean isEmpty(){
    //         return head == null;
    //     }
    //     public void push(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             head = newNode;
    //             return;
    //         }
    //         newNode.next = head;
    //         head = newNode;
    //     }
    //     public int pop(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }
    //     public int peek() {
    //         if(isEmpty()){
    //             return -1;
    //         }

    //         return head.data;
    //     }
    // }
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        while(!S.isEmpty()){
            System.out.println(S.peek());
            S.pop();
        }
    }    
}
