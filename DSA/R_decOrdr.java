public class R_decOrdr {
    public static void decreasingOrder(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }
    public static void main(String[] args){
        decreasingOrder(10);
    }
}
