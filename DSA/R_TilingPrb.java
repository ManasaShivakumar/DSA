public class R_TilingPrb {
    public static int Tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int total = Tiling(n-1)+Tiling(n-2);
        return total;
    }
    public static void main(String[] args) {
        System.out.println(Tiling(4));
    }    
}
