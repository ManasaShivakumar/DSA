import java.util.*;
public class Height_tree {
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
    public static int height(Node root){
        if(root == null){
            return 0; // return -1;(for interms of edge)
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.max(lh, rh)+1);
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int l_count = count(root.left);
        int r_count = count(root.right);
        return  (l_count + r_count + 1);
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        return (lsum + rsum + root.data);
    }

    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }
        int ld = diameter1(root.left);
        int rd = diameter1(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int self_d = lh + rh + 1;
        return Math.max(self_d, Math.max(ld, rd));
    }

    static class Info{
        int d;
        int h;
        public Info(int d, int h){
            this.d = d;
            this.h = h; 
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info l_info = diameter2(root.left);
        Info r_info = diameter2(root.right);

        int dm = Math.max((l_info.h+r_info.h+1), Math.max(l_info.d, r_info.d));
        int ht = Math.max(l_info.h, r_info.h)+1;

        return new Info(dm, ht);
    }

    public static boolean isIdentical(Node node, Node subroot){
        if(node == null && subroot == null){
            return true;
        }
        else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }

        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    static class Info2 {
        Node node;
        int hd;
        public Info2(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue<Info2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        q.add(new Info2(root, 0));
        q.add(null);
        int min = 0, max = 0;
        while(!q.isEmpty()){
            Info2 curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info2(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null){
                    q.add(new Info2(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
        
        
    }    
}
