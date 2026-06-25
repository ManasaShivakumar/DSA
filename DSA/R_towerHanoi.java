public class R_towerHanoi {
    public static void towerOfHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Transfering "+n+" from "+src+" -> "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfering "+n+" from "+src+" -> "+dest);
        towerOfHanoi(n-1, help, src, dest);
        
    }
    public static void main(String[] args) {
        towerOfHanoi(2, "S", "H", "D");
    }    
}
