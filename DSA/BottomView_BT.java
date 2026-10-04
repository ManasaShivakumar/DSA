import java.util.TreeMap;
public class BottomView_BT {
    static class Node {
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    //O(nlogn)
    public static void getBottomView(Node root, int depth, int hd, TreeMap<Integer, int[]> map){
        if(root == null){
            return ;
        }
        if(!map.containsKey(hd)){
            map.put(hd, new int[]{root.data, depth});
        }

        else{
            int[] p = map.get(hd);
            if(p[1] <= depth){
                p[0] = root.data;
                p[1] = depth;
            }
            map.put(hd, p);
        }

        getBottomView(root.left, depth+1, hd-1, map);
        getBottomView(root.right, depth+1, hd+1, map);
    }
    public static void printBottomView(Node root){
        TreeMap<Integer, int[]> map = new TreeMap<>();
        getBottomView(root, 0, 0, map);

        for(int[] val: map.values()){
            System.out.print(val[0]+" ");
        }
    }
    public static void main(String[] args){
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.left = new Node(4);
        root.right.right = new Node(25);

        printBottomView(root);
    }
}
