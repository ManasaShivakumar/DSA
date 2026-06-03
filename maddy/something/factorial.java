package maddy.something;
public class factorial {
    public int factorial_num(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }    
}
