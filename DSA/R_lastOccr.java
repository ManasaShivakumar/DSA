public class R_lastOccr {
    public static int lastOccurance(int arr[], int i, int key){
        if(i == arr.length) {
            return -1;
        }  
        int isFound = lastOccurance(arr, i+1, key);      
        if( isFound == -1 && arr[i] == key ){            
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,4,5};
        System.out.print(lastOccurance(arr, 0 , 5));
    }    
}
