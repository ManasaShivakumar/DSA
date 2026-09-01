import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else if(root.data < val){
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static Node build_BST(int[] values){
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
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
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    public static Node findIS(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(root == null){
            return null;
        }
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val) {
            root.right = delete(root.right, val);
        }
        else if(root.data == val){
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3
            Node IS = findIS(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;       
    }

    public static void printInrange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInrange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInrange(root.right, k1, k2);
        }
        else if(root.data > k2){
            printInrange(root.left, k1, k2);
        }
    }
    static ArrayList<Integer> path = new ArrayList<>();
    public static void printpath(Node root){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        printpath(root.left);
        printpath(root.right);
        path.remove(path.size()-1);
    }
    
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        } 

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }
    public static void main(String[] args) {
        // int values[] = {8,5,10,3,6,11,14};
        // Node root = build_BST(values);
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(2);
        if(isValidBST(root, null, null)){
            System.out.println("Valid BST");
        }
        else{
            System.out.println("Not valid BST");
        }
        
    }    
}

