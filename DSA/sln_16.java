import java.util.*;
public class sln_16 {
    public static double average(double a, double b, double c) {
        return ((a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("The average of 3 numbers : "+(average(a,b,c)));
        sc.close();
    }
    
}
