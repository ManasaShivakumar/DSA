public class sum_subarr {
    public static void print_sum_subarr(int num[]) {
        int max = Integer.MIN_VALUE;
        //int min = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    sum += num[k];
                }
                System.out.print("["+sum+"]");
                if (max<sum) {
                    max = sum;
                }
                // if (min>sum) {
                //     min = sum;
                // }
            }
            System.out.println();            
        }
        System.out.println("Maximum value in subarray : "+max);
        //System.out.println("Minimum value in subarray : "+min);
    }
    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};
        print_sum_subarr(num);
    }
    
}
