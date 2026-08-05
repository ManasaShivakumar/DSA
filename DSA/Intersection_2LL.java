//O(m*n)
public class Intersection_2LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node getIntersectionNode(Node head1, Node head2){
        Node temp2 = head2;
        while(temp2 != null){
            Node temp = head1;
            while(temp != null){
                if(temp == temp2 ){
                    return temp;
                }
                temp = temp.next;
            }
            temp2 = temp2.next;
        }
        return null;
    }
    public static void main(String[] args) {
       Node head1 = new Node(1);
       Node head2 = new Node(4);
       
       head1.next = new Node(2);
       head1.next.next = new Node(3);
       head2.next = new Node(5);

       Node newNode = new Node(6);
       head1.next.next.next = head2.next.next = newNode;

       Node newNode2 = new Node(7);
       head1.next.next.next.next = head2.next.next.next = newNode2;
       Node intersect = getIntersectionNode(head1, head2);
       if(intersect == null){
        System.out.println("No intersection Node");
       }
       else{
        System.out.println("Intersection Node = "+intersect.data);
       }
    }    
}

