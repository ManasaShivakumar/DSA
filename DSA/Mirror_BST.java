public class Mirror_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public  static Node createMirror(Node root){
        if(root == null){
            return null;
        }
       Node leftST = createMirror(root.left);
       Node rightST = createMirror(root.right);

       root.left = rightST;
       root.right = leftST;

       return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        inorder(root);
        System.out.println();
        createMirror(root);
        inorder(root);

    }    
}
