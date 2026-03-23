//import java.util.Arrays;
//import java.util.Collections;
public class basic_sorting {
    public static void bubble_sort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) { 
            int swap = 0;
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }                
            }
            if (swap == 0) {
                break;
            }
        }
    }
    public static void selection_sort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int min_index = i;
            for(int j= i+1; j<arr.length; j++) {
                if(arr[min_index] < arr[j]) {
                    min_index = j;
                }
            }          
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;                         
        }
    }
    public static void insertion_sort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;            
        }
    }
    public static void counting_sort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int freq[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }
        int j=0;
        for(int i=freq.length-1; i>0; i--) {
            while(freq[i]>0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }
    public static void print_array(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //Arrays.sort(arr, 0, 3);
        //Arrays.sort(arr, 2, 5, Collections.reverseOrder());
        counting_sort(arr);
        print_array(arr);
    }    
}
 