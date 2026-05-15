public class oddeven_BM{
    public static void oddoreven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("odd Number");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(4);
        oddoreven(11);
        oddoreven(59);
    }
}