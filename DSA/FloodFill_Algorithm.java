public class FloodFill_Algorithm {
    public static void fill(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc] || image[sr][sc]!=orgCol){
            return;
        }
        vis[sr][sc] = true;
        image[sr][sc] = color;
        fill(image, sr, sc-1, color, vis, orgCol);
        fill(image, sr, sc+1, color, vis, orgCol);
        fill(image, sr-1, sc, color, vis, orgCol);
        fill(image, sr+1, sc, color, vis, orgCol);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        fill(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args){
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        image = floodFill(image, sr, sc, color);
        
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[0].length; j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
