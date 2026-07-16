public class Search_sortedArr {
    //using only one loop
    public static int bin_Search(int arr[], int tar, int si, int ei){
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(arr[mid] == tar){
                return mid;
            }

            else if(arr[si] <= arr[mid]){
                if(tar >= arr[si] && tar <= arr[mid]){
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }
            }
            else{
                if(tar >= arr[mid] && tar <= arr[ei]) {
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;        
    }
    public static int search(int arr[], int tar, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //find mid
        int mid = si+(ei-si)/2;

        //found
        if(arr[mid]==tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a
            if(tar >=arr[si] && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //case b
            else{
                return search(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else{
            //case c
            if(tar >=arr[mid] && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        // int tar = 0;
        int idx = bin_Search(arr, 0, 0, arr.length-1);
        System.out.println(idx);
    }    
}
