import java.util.Stack;
public class Next_greaterEle {
    public static void findNxtgreater(int arr[], int nxtgrtr[]){
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            int curr = arr[i];
            while(!s.isEmpty() && arr[s.peek()] <= curr){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgrtr[i] = -1;
            }
            else{
                nxtgrtr[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int nxtgrtr[] = new int[arr.length];

        findNxtgreater(arr, nxtgrtr);
        for(int i=0; i<nxtgrtr.length; i++){
            System.out.print(nxtgrtr[i]+" ");
        }
    }    
}
