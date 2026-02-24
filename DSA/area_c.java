import java.util.*;
public class area_c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :");
        float r = sc.nextFloat();
        float area = 3.14f * r * r;
        System.out.println("area of circle is :"+area);
        sc.close();
    }
    
}
