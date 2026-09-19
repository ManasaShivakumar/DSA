import java.util.Stack;
public class BST_problems {
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
    public static int printsumInrange(Node root, int k1, int k2){
        if(root == null){
            return 0;
        }
        if(root.data >= k1 && root.data <= k2){
            return printsumInrange(root.left, k1, k2) + root.data + printsumInrange(root.right, k1, k2);           
        }
        else if(root.data < k1){
            return printsumInrange(root.right, k1, k2);
        }
        else {
            return printsumInrange(root.left, k1, k2);
        }        
    }
    static int mindiff = Integer.MAX_VALUE;
    static int val = 0;
    public static int min_diff(Node root, int k){
        mindiff = Integer.MAX_VALUE;
        val = 0;
        findClosest(root, k);
        return val;
    }
    public static void findClosest(Node root, int k){
        if(root == null){
            return;
        }
        int currdiff = Math.abs(root.data - k);
        if(currdiff < mindiff){
            mindiff = currdiff;
            val = root.data;
        }
        if(root.data == k){
            val = root.data;
            return;
        }
        else if(root.data > k){            
            findClosest(root.left, k);
        }
        else {           
            findClosest(root.right, k);
        }
    }
    static int count = 0;
    public static Node Kthsmallest(Node root, int k){
        if(root == null){
            return null;
        }
        Node left = Kthsmallest(root.left, k);
        if(left != null){
            return left;
        }
        count ++;
        if(count == k){
            return root;
        }
        return Kthsmallest(root.right, k);
    }
    public static Node search(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data == key){
            return root;
        }
        if(root.data > key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }
    public static void findPairs_equalsX(Node root, Node root2, int x){
        if(root == null){
            return;
        }
        int key = x-root.data;
        Node pair = search(root2, key);
        if(pair != null){
            System.out.print("("+root.data+", "+pair.data+") ");
        }
        findPairs_equalsX(root.left, root2, x);
        findPairs_equalsX(root.right, root2, x);

    }
    public static void findPairs(Node root, Node root2, int x){
        if(root == null || root2 == null){
            return;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        Node top1, top2;
        int count = 0;
        while(true){
            while(root != null){
                st1.push(root);
                root = root.left;
            }
            while(root2 != null){
                st2.push(root2);
                root2 = root2.right;
            }
            if(st1.isEmpty() || st2.isEmpty()){
                break;
            }
            top1 = st1.peek();
            top2 = st2.peek();

            if(top1.data + top2.data == x){
                count++;
                System.out.print("("+top1.data+", "+top2.data+") ");
                st1.pop();
                st2.pop();
                root = top1.right;
                root2 = top2.left;
            }
            else if(top1.data + top2.data > x) {
                st2.pop();
                root2 = top2.left;
            }
            else {
                st1.pop();
                root = top1.right;
            }
        }
        System.out.println();
        System.out.print("No of pairs = "+count);
    }
    static class Info{
        int max;
        int min;
        boolean isBST;
        int sum;
        int currsum;
        public Info(int m, int mi, boolean is, int su, int curr){
            max = m;
            min =  mi;
            isBST = is;
            sum = su;
            currsum = curr;
        }
        public Info(){}
    }
    static class INT{
        int a;
    }
    public static int maxSum(Node root){
        INT maxsum = new INT();
        maxsum.a = Integer.MIN_VALUE;
        return findMaxSum(root, maxsum).currsum;
    }
    public static Info findMaxSum(Node root, INT maxsum){
        if(root == null){
            return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0);
        }
        if(root.left == null && root.right == null){
            maxsum.a = Math.max(maxsum.a, root.data);
            return new Info(root.data, root.data, true, root.data, maxsum.a);
        }
        Info L = findMaxSum(root.left, maxsum);
        Info R = findMaxSum(root.right, maxsum);

        Info BST = new Info();
        if(L.isBST && R.isBST && L.max < root.data && R.min > root.data){
            BST.max = Math.max(root.data, Math.max(L.max, R.max));
            BST.min = Math.min(root.data, Math.min(L.min, R.min));                        
            maxsum.a = Math.max(maxsum.a, root.data+L.sum+R.sum);
            BST.sum = root.data + L.sum + R.sum;
            BST.currsum = maxsum.a;
            BST.isBST = true;
            return BST;
        }
        BST.isBST = false;
        BST.currsum = maxsum.a;
        BST.sum = root.data + L.sum + R.sum;
        return BST;
    }
    public static void main(String[] args) {
        // int values[] = {5,3,7,2,4,6,8};
        // Node root = build_BST(values);       
        // int values2[] = {10, 6, 15, 3, 8, 11, 18};
        // Node root2 = build_BST(values2);  
        // findPairs(root, root2, 16);    
        Node root = new Node(5);
        root.left = new Node(14);
        root.right = new Node(3);
        root.left.left = new Node(6);
        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);
        root.right.right = new Node(7);
        System.out.println(maxSum(root));  
              
    }  
}
