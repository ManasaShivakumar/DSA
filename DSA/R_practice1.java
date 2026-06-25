public class R_practice1 {
    public static void printIndexes(int i, int arr[], int key){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){               
            System.out.print(i+" ");
        }        
        printIndexes(i+1, arr, key);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printIndexes(0, arr, 2);
    }    
}
