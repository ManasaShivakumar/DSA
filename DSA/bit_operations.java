public class bit_operations{
    public static int get_ith_bit(int n, int i) {
        int bitmask = 1<<i;
        if((n & bitmask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    } 
    public static int set_ith_bit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clear_ith_bit(int n, int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update_ith_bit(int n, int i, int NB) {
        // if ( NB == 0) {
        //     return clear_ith_bit(n, i);
        // }
        // else {
        //     return set_ith_bit(n, i);
        // }
        n = clear_ith_bit(n, i);
        int bitmask = NB<<i;
        return n | bitmask;
    }
    public static int clear_range_bits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static int clear_i_bits(int n, int i) {
        int bitmask = ((~0) << i);
        return n & bitmask;
    }
    public static boolean power_of_two(int n){
        return (n&(n-1)) == 0 ;
    }
    public static int countSetbits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0) {
                count++;                
            }
            n = n>>1;
        }
        return count;
    }
    public static int exponentiation(int a, int n){
        int ans = 1;
        while (n>0) {
            if((n&1)!=0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void swap_numbers(int x, int y) {
        x=x^y;
        y=x^y;
        x=x^y;        
        System.out.print("x="+x+", y="+y);        
    }
    public static int add_one(int a){
        return -~a;
    }
    public static void upper_lower(){
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch|' '));
        }
    }
    public static void lower_upper(){
        for(char ch='a'; ch<='z'; ch++){
            System.out.print((char)(ch^' '));
        }
    }
    public static int modular_expo(int a, int n, int mod){
        int ans = 1;       
        while(n>0){
            if((n&1)!=0){
                ans = (ans*a)%mod;
            }
            a = (a*a)%mod;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {     
       System.out.println(modular_expo(2,10,1000));      
    }
}