
import java.util.ArrayList;
public class Monotonic_Arr {
    public static boolean monotonicArrList(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                inc = false;
            }
            if(list.get(i) < list.get(i+1)){
                dec = false; 
            }
        }
        return inc || dec ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        System.out.println(monotonicArrList(nums));
    }
}
