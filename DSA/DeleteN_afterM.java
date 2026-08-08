public class DeleteN_afterM {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;    
    public void addLast(int data){
        Node newNode = new Node(data);        
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void skipM_deleteN(int M, int N){
        Node curr = head, t;
        int count;
        while(curr != null){
            for(count = 1; count < M && curr != null; count++){
                curr = curr.next;
            }
            if(curr == null){
                return;
            }

            t = curr.next;
            for(count = 1; count<=N && t != null; count++){
                t = t.next;                
            }
            curr.next = t;
            if(t== null){
                tail = curr;
            }
            curr = t;           
        }
    }
    public static void main(String[] args) {
        DeleteN_afterM ll = new DeleteN_afterM();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.print();
        ll.skipM_deleteN(3,2);
        ll.print();
    }    
}
