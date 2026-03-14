public class sub_arr {
    public static void print_subarray(int num[]) {
        int ts = 0;
        for(int i=0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                System.out.print("[");
                for(int k=i; k<=j; k++) {                    
                    System.out.print(" "+num[k]+" ");
                }
                ts++;
                System.out.print("]");
            }
            System.out.println();
        }
        System.out.println("Total subarrays : "+ts);
    }
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12};
        print_subarray(num);
    }
    
}
