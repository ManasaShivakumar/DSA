
public class DoublyLink_list {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;            
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;          
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if( head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;        
    }
    public void add(int data, int idx){
        if(idx < 0 || idx > size){
            System.out.println("Invalid index");
            return;
        }    
        if(idx == size){
            addLast(data);
            return;
        }
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;            
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head == null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public int remove(int idx){
         if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return Integer.MIN_VALUE;
        }
        if(idx == 0){
            return removeFirst();
        }
        if(idx == size-1){
            return removeLast();
        }       
        Node temp = head;
        int i=0;
        while( i < idx-1){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size -- ;
        return val;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLink_list dll = new DoublyLink_list();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        dll.addLast(6);       
        dll.add(4, 3);
        dll.add(7, 6);
        dll.print();
        dll.reverse();
        dll.print();        
    }
}
