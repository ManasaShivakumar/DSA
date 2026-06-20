public class R_incOrdr {
    public static void IncreasingOrder(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        IncreasingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] mansa){
        IncreasingOrder(10);
    }
    
}
