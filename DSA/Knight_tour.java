public class Knight_tour {
    public static void printSolution(int sol[][]){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void movesOfKT(int N){
        int[][] sol = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sol[i][j] = -1;
            }
        }
        int[] xMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] yMoves = { 1, 2,  2,  1, -1, -2,-2,-1 };
        sol[0][0] = 0;
        if(solveKT(0, 0, 1, sol, xMoves, yMoves)){
            System.out.println("Solution exist");
            System.out.println("--------chess board--------");
            printSolution(sol);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }
    public static boolean isSafe(int x, int y, int[][] sol){
        return (x>=0 && x<N && y>=0 && y<N && sol[x][y]==-1);

    }
    public static boolean solveKT(int x, int y, int ithMove, int sol[][], int[] xMoves, int[] yMoves){
        int k, nxtX, nxtY;
        if(ithMove == N*N){
            return true;
        }
        for(k=0; k<8; k++){
            nxtX = x + xMoves[k];
            nxtY = y + yMoves[k];
            if(isSafe(nxtX, nxtY, sol)){
                sol[nxtX][nxtY] = ithMove;
                if(solveKT(nxtX, nxtY, ithMove+1, sol, xMoves, yMoves)){
                    return true;
                }
                sol[nxtX][nxtY] = -1;                
            }                        
        }
        return false;
    }
    static int N=8;
    public static void main(String[] args) {
        movesOfKT(N);
    }    
}
