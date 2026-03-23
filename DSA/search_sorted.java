public class search_sorted {
    public static boolean sorted_search(int matrix[][], int key) {
        int SR = 0, SC = matrix[0].length-1;
        while(SR < matrix.length && SC >= 0) {
            if( key == matrix[SR][SC]) {
                System.out.println("Key found at index : ("+SR+","+SC+")");
                return true;
            }
            else if (key < matrix[SR][SC]) {
                SC--;
            }
            else {
                SR++;
            }
        }        
        System.out.println("Key not found");
        return false;
        // int SR = matrix.length-1, SC = 0;
        // while(SR >=0 && SC <matrix[0].length) {
        //     if(key == matrix[SR][SC]) {
        //         System.out.println("Key found at index : ("+SR+","+SC+")");
        //         return true;
        //     }
        //     else if(key < matrix[SR][SC]) {
        //         SR--;
        //     }
        //     else {
        //         SC++;
        //     }            
        // }
        // System.out.println("Key not found");
        // return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        int key = 33;
        sorted_search(matrix, key);
    }    
}
