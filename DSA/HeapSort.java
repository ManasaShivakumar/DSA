public class HeapSort {
    private static void heapify(int[] arr, int i, int size){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int max = i;
        if(left < size && arr[max] < arr[left]){
            max = left;
        }
        if(right < size && arr[max] < arr[right]){
            max = right;
        }
        if(max != i){
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;

            heapify(arr, max, size);
        }
    }
    public static void heap_Sort(int[] arr){ //O(2nlogn) = O(nlogn)
        int n = arr.length;
        for(int i=n/2; i>=0; i--){ //n/2 times
            heapify(arr, i, n);    //O(n/2*logn) = O(nlogn)        
        }
        for(int i=n-1; i>=0; i--){ //n times
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);  //O(n*logn) = O(nlogn)
        }
    }
    public static void main(String[] args){
        int arr[] = {100, 62, 94, 15, 302, 48, 789, 120};
        heap_Sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }  
}
