public class inv_HFpy {
    public static void inv_Half_Pyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n+1-i); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_Half_Pyramid(5);
    }
    
}
