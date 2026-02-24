import java.util.*;
public class sum_nature {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n) {
            sum += i;
            i++;
        }
        System.out.println("sum = "+sum);
        sc.close();
    }
    
}
