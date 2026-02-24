public class dec_bin {
    public static void decTObin(int n) {
        int num = n;
        int pwr = 0;
        int bin = 0;
        while (n>0) {
            int rem = n%2;
            bin = bin + rem*(int)Math.pow(10,pwr);
            pwr++;
            n = n/2;
        }
        System.out.println("the binary form of "+num+" is = "+bin);
    }
    public static void main(String[] args) {
        decTObin(10);
    }
    
}
