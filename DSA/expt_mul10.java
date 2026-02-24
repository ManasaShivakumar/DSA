import java.util.*;
public class expt_mul10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("enter ur number : ");
            int n = sc.nextInt();
            if (n%10 == 0) {
                continue;
            }
            if (n == 111) {
                break;
            }
            System.out.println("num = "+n);
        } while (true);
        sc.close();
    }
    
}
