
public class MergeK_LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node sortedMerge(Node a, Node b){
        Node result = null;
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        if(a.data <= b.data){
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        if(b.data < a.data){
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    public static Node mergeKlists(Node arr[], int last){        
        while(last != 0){
            int i=0 , j=last;
            while(i < j){
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++; 
                j--;                
                if(i>=j){
                    last = j;
                }
            }
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int k = 3;
        Node arr[] = new Node[k];
        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        
        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
              
        Node head = mergeKlists(arr, k-1);
        print(head);
    }    
}
