public class Circularlink_List {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node last;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = last = newNode;
            last.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        last.next = head;
    }    
    public void print(){
        if(head == null){
            System.out.println("Cll is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp != head);
        System.out.println("--back to head");
    }
    public static void main(String[] args) {
        Circularlink_List cll = new Circularlink_List();
        cll.addFirst(3);
        cll.addFirst(2);
        cll.addFirst(1);
        cll.print();
    }
}
