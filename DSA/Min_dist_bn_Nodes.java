public class Min_dist_bn_Nodes{
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
    public static int lcadist(Node LCA, int n){
        if(LCA == null){
            return -1;
        }
        if(LCA.data == n){
            return 0;
        }

        int left = lcadist(LCA.left, n);
        int right = lcadist(LCA.right, n);

        if(left > -1){
            return left+1;
        }
        if(right > -1){
            return right+1;
        }

        return -1;
    }
    public static int min_dist(Node root, int n1, int n2){
        Node LCA = lca(root, n1, n2);
        int dist1 = lcadist(LCA, n1);
        int dist2 = lcadist(LCA, n2);

        return dist1+dist2;
    }

    public static int kth_ancestor(Node root, int k, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = kth_ancestor(root.left, k, n);
        int rightdist = kth_ancestor(root.right, k, n);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }

        int max = Math.max(leftdist, rightdist);
        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;
    }
    public static int sum_tree(Node root){
        if(root == null){
            return 0;
        }
        int left = sum_tree(root.left);
        int right = sum_tree(root.right);
        int data = root.data;
        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;
        root.data = newleft + left + right + newright;

        return data; 
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        sum_tree(root);
        preorder(root);    
        
    }  
}
