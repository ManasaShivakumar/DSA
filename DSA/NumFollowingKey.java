import java.util.ArrayList;
public class NumFollowingKey {
    public static int mostFreq_num(ArrayList<Integer> nums, int key){
        int[] results = new int[1000];
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) == key)
                results[nums.get(i+1)-1]++;            
        }
        int max = Integer.MIN_VALUE, ans=0;        
        for(int i=0; i<1000; i++){
            if(max < results[i]){
                max = results[i];
                ans = i+1; 
            }           
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);nums.add(2);nums.add(2);nums.add(2);nums.add(3);        
        int key = 2; 
        System.out.println(mostFreq_num(nums, key));
    }    
}
