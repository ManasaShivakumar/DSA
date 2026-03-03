import java.util.*;
public class sln_20 {
    public static int sumOFdig(int n) {
        int sum = 0;
        while(n>0) {
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr any number : ");
        int n = sc.nextInt();
        System.out.println("Sum of digits = "+(sumOFdig(n)));
        sc.close();
    }
    
    
}
