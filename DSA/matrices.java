import java.util.*;
public class matrices {
    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void return_max(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 5);
        return_max(matrix);
        sc.close();

    }
    
}
