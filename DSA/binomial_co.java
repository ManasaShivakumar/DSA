public class binomial_co {
    public static int factorial(int n){
        int fact =1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int bino_coeff(int n, int r) {
        int f_n = factorial(n);
        int f_r = factorial(r);
        int diff = n-r;
        int f_diff = factorial(diff);        
        return (f_n/(f_r*f_diff));
    }
    public static void main(String[] args) {
        System.out.println((bino_coeff(5, 2)));


    }
    
    
}
