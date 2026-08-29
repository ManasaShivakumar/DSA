import java.util.HashMap;
public class BT_problems {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isUnivalued(Node root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.data != root.left.data){
            return false;
        }
        if(root.right != null && root.data != root.right.data){
            return false;
        }        

        return isUnivalued(root.left) && isUnivalued(root.right);
    }

    public static Node invert_tree(Node root){
        if(root == null){
            return root;
        }
        Node left = invert_tree(root.left);
        Node right = invert_tree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static Node deleteLeaf_valueX(Node root , int x){
        if(root == null){
            return null;
        }

        root.left = deleteLeaf_valueX(root.left, x);
        root.right = deleteLeaf_valueX(root.right, x);
        if(root.data == x && root.left == null && root.right == null){
            return null;
        }  
        
        return root;
    }
    static  HashMap<String, Integer> map = new HashMap<>();
    public static String find_duplicates(Node root){
        if(root == null){
            return "";
        }
       
        String str = "(";
        str += Integer.toString(root.data);
        str += find_duplicates(root.left);
        str += find_duplicates(root.right);
        str += ")";

        if(map.get(str) != null && map.get(str) == 1){
            System.out.println("subtree : "+str);
            System.out.println("root : "+root.data);
        }
        if(map.containsKey(str)){
            map.put(str, map.get(str)+1);
        }
        else{
            map.put(str, 1);
        }

        return str;
    }
    static int maxPath = Integer.MIN_VALUE;
    public static int maxPath_sum(Node root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0, maxPath_sum(root.left));
        int right = Math.max(0 , maxPath_sum(root.right));
        int currSum = left + right + root.data;

        maxPath = Math.max(maxPath, currSum);

        return (root.data + Math.max(left, right));
    }
    public static void preorder(Node root){
        if(root == null){
            System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);        
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        // root.left.left = new Node(3);
        root.right.left = new Node(15); 
        root.right.right = new Node(7);
        // root.right.left.left = new Node(3);       
        maxPath_sum(root);
        System.out.println(maxPath);
    }    
}
