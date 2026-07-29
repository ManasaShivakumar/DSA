import java.util.ArrayList;
public class Pair_sum1 {
    //Brute Force O(n^2)
    // public static boolean pairSum(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=0; j<list.size(); j++){
    //             if((list.get(i)+list.get(j)) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 Pointer Approach O(n)
    public static boolean pair_Sum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp < rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum == target){
                return true;
            }
            else if(sum < target){
                lp++;
            }
            else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 20;
        System.err.println(pair_Sum(list, target));
    }    
}
