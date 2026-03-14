import java.util.*;
public class sln_22 {
    public static int find_pivote(int nums[]) {
        int left = 0, right = nums.length-1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if ( mid > 0 && nums[mid-1] > nums[mid] ) {
                return mid;                
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid-1;
            }
        }
        return left;
    }
    public static int search(int nums[], int target) {
        int min = find_pivote(nums);
        if(nums[min] <= target && target <= nums[nums.length-1]) {
            return search(nums, min, nums.length-1, target);
        }
        else {
            return search(nums, 0, min, target);
        }
    }
    public static int search(int nums[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left)/2;
            if ( nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the key u want to search : ");
        int key = sc.nextInt();
        int index = search(nums,key);
        if(index == -1) {
            System.out.println("Target not found");
        }
        else {
            System.out.println("The target is at index : "+index);
        }

        
    }    
}
