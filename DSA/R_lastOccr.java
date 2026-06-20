public class R_lastOccr {
    public static int lastOccurance(int arr[], int i, int key){
        if(i==arr.length-1 && arr[i] != key) {
            return -1;
        }        
        if(arr[i] == key ){
            lastOccurance(arr, i+1, key);
            return i;
        }
        return lastOccurance(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,4,5};
        System.out.print(lastOccurance(arr, 0 , 5));
    }
    
}
