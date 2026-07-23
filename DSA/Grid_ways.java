public class Grid_ways {
    public static int factorial(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    //direct method
    public static int grid(int n, int m){
        int fn1= factorial(n-1);
        int fm1= factorial(m-1);
        int fnm = factorial((n-1)+(m-1));

        return fnm/(fn1*fm1);
    }
    public static int gridWays(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        int w1 = gridWays(i, j+1, n, m);
        int w2 = gridWays(i+1, j, n, m); 
        return w1+w2;
    }
    public static void main(String[] args){
        int n=4;
        int m=5;
        int Totalways = grid(n, m);
        System.out.println("Total number of ways = "+Totalways);
    }    
}

