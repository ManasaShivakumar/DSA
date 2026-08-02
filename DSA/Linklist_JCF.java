import java.util.LinkedList;
public class Linklist_JCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(0);
        ll.add(1, 1);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);        
    }
}
