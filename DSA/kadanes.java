public class kadanes { 
    public static void kadanes_max(int num[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i=0; i<num.length; i++) {
            curr += num[i];
            if(curr<0) {
                curr = 0;
            }
            max = Math.max(curr, max);
            System.out.print("["+curr+"]");            
        }
        System.out.println();
        System.out.println("Maximum sum = "+max);
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes_max(num);
    }
    
}
