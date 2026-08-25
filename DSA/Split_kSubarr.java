public class Split_kSubarr {
    public static int ans = Integer.MAX_VALUE;
    public static void split_arrToKsubarr(int[] arr, int k, int idx, int sum, int maxsum){
        if(k == 1){
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for(int i=idx; i<arr.length; i++){
                sum += arr[i];                
            }
            maxsum = Math.max(maxsum, sum);
            ans = Math.min(ans, maxsum);
            return;
        }
        sum = 0;
        for(int i=idx; i<arr.length; i++){
            sum += arr[i];
            maxsum = Math.max(maxsum, sum);
            split_arrToKsubarr(arr, k-1, i+1, sum, maxsum);
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4};
        int k = 3;
        split_arrToKsubarr(arr, k, 0, 0, 0);
        System.out.println("Min of max sums = "+ans);        
    }    
}
