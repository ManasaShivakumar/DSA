import java.util.ArrayList;

public class Pair_sum2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int Bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                Bp = i;
                break;
            }
        }
        int lp = Bp+1;
        int rp = Bp;
        int n = list.size();

        while(lp != rp){
            int sum = list.get(lp) + list.get(rp);
            if(sum == target){
                return true;
            }
            else if(sum < target){
                lp = (lp+1) % n;
            }
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
