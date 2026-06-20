public class R_sumN {
    public static int sumOfnumbers(int n){
        if(n==1){
            return 1;
        }
        return (n+sumOfnumbers(n-1));
    }
    public static void main(String[] args) {
        System.out.println(sumOfnumbers(15));
    }
    
}
