public class Rat_maze {
    public static void printSolution(int[][] sol) {
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void solved(int maze[][]){
        int N = maze.length;
        int[][] sol = new int[N][N];
        if(solveMaze(maze, 0, 0, sol)){
            System.out.println("solution exists");
            printSolution(sol);
        }
        else{
            System.out.println("solution does not exist");
        }
    }

    public static boolean isSafe(int x, int y, int maze[][]){
        return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
    }
    public static boolean solveMaze(int maze[][], int x, int y, int[][] sol){
        if(x == maze.length-1 && y == maze.length-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }
        if(isSafe(x, y, maze)){
            if(sol[x][y]==1){
                return false;
            }
            sol[x][y] = 1;
            if(solveMaze(maze, x+1, y, sol)){
                return true;
            }
            if(solveMaze(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y]= 0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][] = {{1,0,0,0},
                        {1,1,0,1},
                        {0,1,0,0},
                        {1,1,1,1}};
        solved(maze);
    }
}
