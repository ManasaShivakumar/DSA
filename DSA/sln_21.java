import java.util.*;
public class sln_21 {
    public static boolean repeated_elements(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i= 0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(repeated_elements(nums));       
    }
    
}
