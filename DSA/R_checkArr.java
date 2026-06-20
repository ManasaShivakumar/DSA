public class R_checkArr {
    public static boolean checkSortedArr(int arr[], int i){
        if(i== arr.length-1){
            return true;
        } 
        if(arr[i] > arr[i+1]) {            
            return false;
        }  
        return checkSortedArr(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {15,22,33,44,55};
        System.out.println(checkSortedArr(arr, 0));
    }    
}
