public class prime_fn {
    public static boolean isprime(int n) {
        if (n==2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void range_prime(int n) {
        for (int i=2; i<=n; i++) {
            boolean prime = isprime(i);
            if (prime == true) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        //System.out.println((isprime(14)));
        range_prime(50);
    }
    
}
