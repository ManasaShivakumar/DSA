import java.util.ArrayList;

public class Prefix_problem {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;
        int freq;
        public Node() {
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            eow = false;
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans, ArrayList<String> list){        
        if(root == null){
            return ;
        }
        if(root.freq == 1){
            list.add(ans);
            return ;
        }
        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'), list);
            }
        }        
    }
    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        root.freq = -1;
        ArrayList<String> list = new ArrayList<>();
        findPrefix(root, "", list);
        System.out.println(list);
    }    
}
