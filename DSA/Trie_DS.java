public class Trie_DS {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }        
    }

    public static Node root = new Node();//always by default empty
    
}
