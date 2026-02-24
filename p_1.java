import java.util.*;
public class p_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.println("sum is :"+sum);
        System.out.println("product is :"+product);
        sc.close();
    }
    
}
