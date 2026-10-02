import java.util.*;
public class MergeK_sortedLL {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class NodeComparator implements Comparator<Node> {
        public int compare(Node k1, Node k2){
            if(k1.data > k2.data){
                return 1;
            }
            else if(k1.data < k2.data){
                return -1;
            }
            return 0;
        }
    }
    public static Node mergeKlists(Node[] arr, int k){
        PriorityQueue<Node> pq = new PriorityQueue<>(new NodeComparator());
        for(int i=0; i< k; i++){
            if(arr[i] != null){
                pq.add(arr[i]);
            }            
        }

        Node head = new Node(0);
        Node last = head;
        if(pq.isEmpty()){
            return null;
        }
        while (!pq.isEmpty()) {
            Node currNode = pq.poll();
            last.next = currNode;
            last = currNode;
            if(currNode.next != null){
                pq.add(currNode.next);
            }            
        }

        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        int k = 3;
        Node arr[] = new Node[k];

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(7);
        arr[0] = head1;

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(8);
        arr[1] = head2;

        Node head3 = new Node(9);
        head3.next = new Node(10);
        head3.next.next = new Node(11);
        arr[2] = head3;

        Node head = mergeKlists(arr, k);

        while (head != null) {
            System.out.print(head.data+"->");
            head = head.next;            
        }
        System.out.println("null");
    }    
}
