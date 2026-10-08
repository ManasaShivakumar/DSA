import java.util.*;
public class Group_Anagrams {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
        List<String> data;
        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            eow = false;
            data =  new ArrayList<>();
        }
    }
    public static Node root = new Node();

    public static void insert(String str){
        Node curr = root;
        char[] word = str.toCharArray();
        Arrays.sort(word);
        for(int i = 0; i<word.length; i++){
            int idx = word[i]-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
        curr.data.add(str);
    }

    public static List<List<String>> ans;

    public static void findAns(Node root){
        if(root.eow){
            ans.add(root.data);
        }

        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                findAns(root.children[i]);
            }
        }
    }

    public static List<List<String>> getAnagramsGrp(String[] strs, Node root){
        ans = new ArrayList<>();

        for(String word : strs){
            insert(word);
        }

        findAns(root);

        return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(getAnagramsGrp(strs, root));
    }
}
