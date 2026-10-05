import java.util.*;
public class LRU_Cache {

    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    public HashMap<Integer, Node> map;
    public int capacity;
    public LRU_Cache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key){//O(1)
        if(!map.containsKey(key)){
            return -1;
        }

        int ans = map.get(key).value;
        Node ansNode = map.get(key);
        map.remove(key);
        deleteNode(ansNode);
        addNode(ansNode);
        map.put(key, ansNode);
        return ans;
    }
    
    public void addNode(Node newNode){//O(1)
        newNode.next = head.next;
        head.next = newNode;
        newNode.next.prev = newNode;
        newNode.prev = head;
    }
    public void deleteNode(Node oldNode){//O(1)
        Node oldnext = oldNode.next;
        oldNode.prev.next = oldnext;
        oldnext.prev = oldNode.prev;
    }
    public void put(int key, int value){//O(1)    
        if(map.containsKey(key)){
            Node oldNode = map.get(key);
            deleteNode(oldNode);
            map.remove(key);
        }
        if(map.size() == capacity){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node newNode = new Node(key, value);
        addNode(newNode);
        map.put(key, newNode);
    }

    public static void main(String[] args) {
        LRU_Cache obj = new LRU_Cache(2);
        obj.put(1,1);
        obj.put(2,2);
        System.out.println(obj.get(1));
        obj.put(3,3);
        System.out.println(obj.get(2));
        obj.put(4,4);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));
    }
}
