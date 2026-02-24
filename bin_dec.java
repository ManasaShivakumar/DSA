public class bin_dec {
    public static void binTOdec(int binN) {
        int num = binN;
        int pwr = 0;
        int dec = 0;
        while (binN > 0) {
            int ld = binN % 10;
            dec = dec + (ld * (int)Math.pow(2, pwr));
            pwr ++;
            binN /= 10;
        }
        System.out.println("Decimal form of "+num+" is = "+dec);
    }
    public static void main(String[] args) {
        binTOdec(110);
    }
    
}
