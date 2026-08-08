public class EvenOdd_LL{
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
    public void segregateEvenOdd(){
        if(head == null || head.next == null){
            return;
        }
        Node end = head;
        Node curr = head;
        Node prev = null;
        Node newEnd;

        while(end.next != null){
            end = end.next;
        }
        newEnd = end;

        while(curr.data % 2 != 0 && curr != end){
            newEnd.next = curr;
            curr = curr.next;            
            newEnd.next.next = null;
            newEnd = newEnd.next;            
        }

        if(curr.data % 2 == 0){
            head = curr;
            while(curr != end){
                if(curr.data % 2 == 0){
                    prev = curr;
                    curr = curr.next;
                }
                else{
                    prev.next = curr.next;
                    curr.next = null;
                    newEnd.next = curr;
                    newEnd = curr;
                    curr = prev.next;
                }
            }
        }
        else{
            prev = curr;
        }
        if(newEnd != end && end.data % 2 !=0){
            prev.next = end.next;
            end.next = null;
            newEnd.next = end;
            newEnd = end;
        }

        tail = newEnd;
    }
    public static void main(String[] args) {
        EvenOdd_LL ll = new EvenOdd_LL();
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();
        ll.segregateEvenOdd();
        ll.print();
    }
}

