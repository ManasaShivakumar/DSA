import java.util.*;
public class num1_10 {
    public static void main(String args[]) {
        // int n=1;
        // while (n<=10) {
        //     System.out.println(n);
        //     n++;
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
    
}
