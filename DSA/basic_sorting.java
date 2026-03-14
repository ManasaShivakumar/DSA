public class basic_sorting {
    // public static void bubble_sort(int arr[]) {
    //     for(int i=0; i<arr.length-1; i++) { 
    //         int swap = 0;
    //         for(int j=0; j<arr.length-1-i; j++) {
    //             if(arr[j]>arr[j+1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //                 swap++;
    //             }                
    //         }
    //         if (swap == 0) {
    //             break;
    //         }
    //     }
    // }
    public static void selection_sort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int min_index = i;
            for(int j= i+1; j<arr.length; j++) {
                if(arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }          
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;                         
        }
    }
    public static void print_array(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12, 5, 23, 10, 20, 4, 7};
        selection_sort(arr);
        print_array(arr);
    }    
}
 