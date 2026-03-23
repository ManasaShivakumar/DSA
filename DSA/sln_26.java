public class sln_26 {
    public static void print_matrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}};
        int R = matrix.length, C = matrix[0].length;
        int transpose[][] = new int[C][R];
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }       
        print_matrix(matrix);
        print_matrix(transpose);
    }    
}
