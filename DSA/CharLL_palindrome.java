import java.util.Stack;
public class CharLL_palindrome {
     public class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;     
    public void addLast(char data){
        Node newNode = new Node(data);        
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public boolean isPalindrome(){
        boolean ispalin = true;
        Stack<Character> s = new Stack<>();
        Node temp = head;
        while(temp != null){
            s.push(temp.data);
            temp = temp.next;
        }  
          
        while(head!= null){
            char ch = s.pop();
            if(ch != head.data){
                ispalin = false;
                break;
            }
            
            head = head.next;
        }
        return ispalin;
    }
    public static void main(String[] args) {
        CharLL_palindrome ll = new CharLL_palindrome();
        ll.addLast('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('D');
        ll.addLast('A');
        System.out.print(ll.isPalindrome());
    }    
}
