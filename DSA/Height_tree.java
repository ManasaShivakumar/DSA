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
                if(!map.containsKey(curr.hd)){  //existing for the first time 
                    map.put(curr.hd, curr.node);
                }
                // map.put(curr.hd, curr.node); //for bottom view we want last occurance node
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

    public static void kLevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

    public static void klevel2(Node root, int k){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                level++;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else {
                if(level == k){
                    System.out.print(curr.data+" ");
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }
        boolean left = getpath(root.left, n, path);
        boolean right = getpath(root.right, n, path);
        if(left || right){
            return true;
        }

        path.remove(path.size()-1);
        return false;        
    }
    public static Node lowestCommon(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        getpath(root, n2, path2);
        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);
        
        if(rightLCA == null){
            return leftLCA;
        }
        if(leftLCA == null){
            return rightLCA;
        }

        return root;
    }    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print(lca(root, 5, 6).data);        
        
    }    
}
