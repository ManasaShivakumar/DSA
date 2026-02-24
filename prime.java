import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean isprime = true;
        if (n==2) {
            System.out.println(n + " is a prime number");
        }
        else {
            for (int i=2; i<=Math.sqrt(n); i++) { //i<=n/2
                if (n%i == 0) {
                    isprime = false;
                }

            }
            if (isprime == true) {
                System.out.println(n + " is a prime number");
            }
            else {
                System.out.println(n + " is not prime number");
            }

        }
        sc.close();
        
    }
    
}
