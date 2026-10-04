import java.util.HashMap;
public class Two_sum {
    public static int[] getTwo_sum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        //(arr[i], i)
        for(int i=0; i<arr.length; i++){
            int diff = target - arr[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{0, 0};
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int[] res = getTwo_sum(arr, target);        
        System.out.println("["+res[0]+", "+res[1]+"]");                    
    }
}