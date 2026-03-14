public class prefix_array {
    public static void max_prefix_array(int num[]) {
        int max = Integer.MIN_VALUE;
        int PA[] = new int[num.length];
        PA[0] = num[0];
        for(int i=1; i<PA.length; i++) {
            PA[i]= PA[i-1] + num[i];
        }
        for(int i=0; i<num.length; i++) {            
            for(int j=i; j<num.length; j++) {
                int sum = i==0?PA[j]:PA[j] - PA[i-1];
                if(max<sum) {
                    max = sum;
                }
                System.out.print("["+sum+"]");
            }
            System.out.println();
        }
        System.out.println("Maximum value : "+max);
            
    }
    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};
        max_prefix_array(num);
    }
    
}
