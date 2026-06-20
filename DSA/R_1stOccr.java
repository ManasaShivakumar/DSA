public class R_1stOccr {
    public static int firstOccurance(int arr[], int i, int key){
        if(i==arr.length-1 && arr[i] != key) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {25,6,23,5,1,2,5,4,5,};
        System.out.print(firstOccurance(arr, 0 , 5));
    }    
}
