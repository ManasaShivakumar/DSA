public class Inversion_count {
    public static int mergeSort(int arr[], int si, int ei){
        int invcount = 0;
        //we can write like this also
        // if(si==ei){
        //     return 0;
        // }
        //then 
        // int mid=si+(ei-si)/2;
        // invcount = mergeSort(arr, si, mid);
        // invcount += mergeSort(arr, mid+1, ei);
        // invcount += merge(arr, si, mid+1, ei);
        if(ei>si){
            int mid=si+(ei-si)/2;
            invcount = mergeSort(arr, si, mid);
            invcount += mergeSort(arr, mid+1, ei);
            invcount += merge(arr, si, mid+1, ei);
        }
        return invcount;
    }
    public static int merge(int[] arr, int si, int mid, int ei){
        int invcount = 0;
        int i=si, j=mid, k=0;
        int temp[] = new int[(ei-si+1)];

        while(i<mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                invcount +=(mid-i);
                j++;
            }
            k++;
        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(i=si, k=0; i<=ei; i++, k++){
            arr[i]=temp[k];
        }

        return invcount;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }    
}
