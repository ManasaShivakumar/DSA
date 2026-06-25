public class R_Binstr {
    public static void printbinString(int n, int lp, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinString(n-1, 0, str+'0');
        if(lp==0){
            printbinString(n-1, 1, str+'1');
        }
    }
    public static void main(String[] args) {
        printbinString(2, 0, "");
    }    
}


