import java.util.*;
public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String fullname = sc.nextLine();
        int num = sc.nextInt();
        float price = sc.nextFloat();
        System.out.println(name);
        System.out.println(fullname);
        System.out.println(num);
        System.out.println(price);
        sc.close();       
    }
    
}
