import java.util.*;
public class sln_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        float pencil= sc.nextFloat();
        System.out.println("Enter the price of pen");
        float pen=sc.nextFloat();
        System.out.println("Enter the price of eraser");
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println("Total = "+total);
        float newtotal = total + (0.18f * total);
        System.out.println("Grand total = "+newtotal);
        sc.close();
    }
    
}
