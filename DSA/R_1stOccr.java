public class R_1stOccr {
    public static int firstOccurance(int arr[], int i, int key){
        if(i==arr.length) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {25,6,23,1,1,2,4};
        System.out.print(firstOccurance(arr, 0 , 5));
    }    
}
