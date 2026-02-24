import java.util.*;
public class sln_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
        int choice;
        do { 
            System.out.print("enter integers : ");
            int n= sc.nextInt();
            if (n%2 == 0) {
                evensum += n;
            }
            else {
                oddsum += n;
            }
            System.out.print("press 1 to continue or 0 to stop :");
            choice = sc.nextInt();            

        } while (choice == 1);
        System.out.println("Even sum = "+evensum);
        System.out.println("Odd sum = "+oddsum);
    }
    
}
