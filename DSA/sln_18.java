import java.util.*;
public class sln_18 {
    public static void palindrome(int n){
        int org = n;
        int newnum = 0;
        while(n>0) {
            int rem = n%10;
            newnum = newnum*10 + rem;
            n = n/10;
        }
        if (newnum == org) {
            System.out.println("Yes it is a Palindrome");
        }
        else {
            System.out.println("No it is not a palindrome");
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr any number except 1 digit : ");
        int num = sc.nextInt();
        palindrome(num);
        sc.close();
    }

    
}
