public class R_pwr {
    public static int printPower(int x, int n){
        if(n==1){
            return x;
        }
        return (x*(printPower(x, n-1)));
    }

    //Optimized
    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        int halfpwr = power(x, n/2);
        int halfpwrSq = halfpwr * halfpwr;
        if(n % 2 != 0){
            return x*halfpwrSq;
        }        
        return halfpwrSq;        
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }    
}
