import java.util.*;
public class large_3n {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c) {
            System.out.println("A is greater of 3");
        }
        else if (b>=c) {
            System.out.println("B is greater of 3");
        }
        else {
            System.out.println("C is greater of 3");
        }
        sc.close();
    }
    
}
