import java.util.*;
public class sln_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("Average is : "+avg);
        sc.close();
    }
    
}
