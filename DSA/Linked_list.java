
public class Linked_list {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail; 
    public static int size;
    public void addFirst(int data){  // no need to be static here bcz we are accessing it through ll.
        //1.create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        //2. new node's next = head
        newNode.next = head ;
        //3. head = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
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
    public void add(int idx, int data){
       if(idx == 0){
        addFirst(data);
        return;
       }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val= prev.next.data;
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }
    public int remove(int idx){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(idx < 0 || idx > size-1){
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
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        Node temp = head ;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public int deleteNthfromEnd(int n){
        //calculate size then use it
        // int sz = 0;
        // Node temp = head;
        // while(temp != null){
        //     temp=temp.next;
        //     sz++;
        // }
        if(n <= 0 || n > size){
            System.out.println("Invalid n");
            return Integer.MIN_VALUE;
        }
        if(n == size){
            int val = head.data;
            head = head.next;
            //return removeFirst();
            return val;
        }       
        Node temp = head;
        int i = 1;
        while (i < (size-n)){
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size -- ;
        return val;
    }
    public static void main(String[] args) {
        Linked_list ll = new Linked_list();        
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(4);
        ll.addLast(5); 
        ll.add(2, 3);
        ll.print();
        System.out.println("removed - "+ ll.deleteNthfromEnd(2));
        ll.print(); 
        System.out.println(size);
       
    }    
}
