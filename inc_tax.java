import java.util.*;
public class inc_tax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary amount : ");
        int salary = sc.nextInt();
        if (salary < 500000) {
            System.out.println("0% tax");
        }
        else if (salary >= 500000 && salary <= 1000000) {
            System.out.println("Tax = "+ (salary*(0.2)));
        }
        else if (salary > 1000000) {
            System.out.println("Tax = "+ (salary*(0.3)));
        }
        sc.close();
    }
    
}
