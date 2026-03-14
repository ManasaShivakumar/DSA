public class trapping_RW {
    public static int trapping_rainwater(int height[]) {
        int n = height.length;
        int TW = 0;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        for(int i=1; i<n; i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }
        for(int i=n-2; i>=0; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }
        for(int i=0; i<n; i++) {
            int WL = Math.min(left[i], right[i]);
            TW += (WL-height[i])*1; 
        }
        return TW;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println("The total volume of trapped water = "+ trapping_rainwater(height));
    }
    
}
