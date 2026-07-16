public class Majority_element {
    //brout force
    public static int returnCount(int[] nums){
        int majorityCount = nums.length/2;
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count > majorityCount){
                return nums[i];
            }
        }
        return -1;
    }
    //Divide & Conquer
    public static int majorityElement(int[] nums, int si, int ei){
        if(si==ei){
            return nums[si];
        }
        int mid = si+(ei-si)/2;
        int left = majorityElement(nums, si, mid);
        int right = majorityElement(nums, mid+1, ei);
        if(left == right){
            return left;
        }

        int leftcount = countInRange(nums, left, si, ei);
        int rightcount = countInRange(nums, right, si, ei);

        return leftcount > rightcount ? left : right;

    }
    public static int countInRange(int[] nums, int N , int si, int ei){
        int count = 0;
        for(int i=si; i<=ei; i++){
            if(nums[i]==N){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums, 0, nums.length-1));
    }    
}
