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
    //slow-fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//slow is my midNode
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node midNode = findMid(head);

        //reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //check 1st half = 2nd half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }
    public static boolean isCycle(){ // Floyd's CFA
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point
        slow = head;
       
        if(slow == fast){
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return;
        }

        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;           
            fast = fast.next;
        }
        //remove cycle
        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;  
                temp = temp.next;              
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }           
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node leftHalf = mergeSort(head);
        Node rightHalf = mergeSort(rightHead);

        return merge(leftHalf, rightHalf); 
    }
    public void zig_ZagLL(){
        //find Mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //Reverse 2nd half
        Node prev = null;
        Node curr = mid.next;
        Node next;
        mid.next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //Alternate merging
        Node RH = prev;
        Node LH = head;
        Node nextL, nextR;
        while(LH != null && RH != null){
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            LH = nextL;
            RH = nextR;
        }                
    }
    public static void main(String[] args) {
        Linked_list ll = new Linked_list();        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zig_ZagLL();
        ll.print();             
    }    
}
