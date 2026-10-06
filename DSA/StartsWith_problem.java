public class StartsWith_problem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow;
        public Node() {
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    public static Node root = new Node();
    
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args){
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith("app"));
        System.out.println(startsWith("moon"));

    }    
}
