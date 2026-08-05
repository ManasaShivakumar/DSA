public class Circularlink_List {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }    
    public static Node last;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(last == null){
            last = newNode;
            last.next = newNode;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        
    }    
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(last == null){
            last = newNode;
            last.next = newNode;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }
    public void add(int data, int idx){
        if(idx < 0 || idx > size){
            System.out.println("Invalid Index");
            return;
        }
        if (idx == 0){
            addFirst(data);
            return;
        }
        if(idx == size){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = last.next;
        int i=0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(last == null){
            System.out.println("Cll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = last.data;
            last = null;
            size--;
            return val;
        }
        int val = last.next.data;              
        last.next = last.next.next;          
        size--; 
        return val;     
    }
    public int removeLast(){
        if(last == null){
            System.out.println("Cll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = last.data;
            last = null;
            size--;
            return val;
        }
        Node temp = last.next;
        int i=0;
        while(i < size-2){
            temp = temp.next;
            i++;
        }
        int val = last.data;
        temp.next = last.next;
        last = temp;
        size--;
        return val;                
    }
    public int remove(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid Index");
            return Integer.MIN_VALUE;
        }
        if (idx == 0){           
            return removeFirst();
        }
        if(idx == size-1){           
            return removeLast();
        }
        Node temp = last.next;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }
    public void reverse(){
        if(last == null || last.next == last){
            return;
        }
        Node prev = last;
        Node head = last.next;
        Node curr = head;
        Node next;
        do {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }while(curr != head);
        last = head;        
    }
    public void print(){
        if(last == null){
            System.out.println("Cll is empty");
            return;
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp != last.next);
        System.out.println("--back to head");
    }
    public static void main(String[] args) {
        Circularlink_List cll = new Circularlink_List();
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.addLast(5);
        cll.addLast(6);      
        cll.add(4,3);
        cll.add(7, 6);
        cll.print();
        cll.reverse();
        cll.print();
    }
}
