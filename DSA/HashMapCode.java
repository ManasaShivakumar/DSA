import java.util.*;
public class HashMapCode {
    static class HashMap<K, V> { // <K, V> -> genric - parameterized types - when data type is not fixed we have to genralize it to make it availbale for all datatype 
        private class Node {
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[]; //it is array and it's data type is LL which stores nodes just like int, float, string
        
                        //the warning of LL is unchecked warning 
        @SuppressWarnings("unchecked")// this.buckets = new LinkedList[4] - we can't directly write LL in some java versions we have to tell the type LL so, if we simply write LL[4] java will not let the code to run it gives error/warnings so to suppress that warnings and to make code to run we have to write  it
        public  HashMap() { // hashmap constructor 
            this.n = 0;
            this.N = 4;
            this.buckets = new LinkedList[N]; //creating array of size 4 - it is empty arr of size 4 before creating LL inside each idx
            for(int i=0; i<4; i++) { // each index of array should store a LL data type so, we are creating empty LL 
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N; // to Know idx is btw 0 - size-1 or not
        }
        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N*2];
            N*=2;
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in bucket
            for(int i=0; i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){ //O(lambda) -> O(1)
            int bi = hashFunction(key); // should be btw 0 - size-1
            int di = SearchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n/N;

            if(lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){ //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if(di != -1){
                return true;
            }
            return false;
        }

        public V get(K key) { //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            return null;
        }

        public V remove(K key){ //O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if(di != -1){
                Node node  = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("India", 120);
        map.put("china", 200);
        map.put("Nepal", 50);
        map.put("US", 20);
        map.put("UK", 500);       

        // System.out.println(map.isEmpty());
        // map.remove("India");
        // System.out.println(map.get("India"));
        // System.out.println(map.containsKey("canada"));

        ArrayList<String> keys =map.keySet();
        System.out.println(keys);
        for(String k : keys){
            System.out.println(k +" : "+map.get(k));
        }        
    }    
}
