public class invR_hfPy {
    public static void Inv_rotated_hfPY(int row) {
        for(int i=1; i<=row; i++) {
            for (int j=1; j<=row-i; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inv_rotated_hfPY(4);
    }
    
}
