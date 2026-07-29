import java.util.ArrayList;
public class Beautiful_Arr {
    //Iterative Approach
    public static ArrayList<Integer> creatBeautiful_Arr(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for( int i=2; i<=n; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer e:ans){
                if(e*2 <= n) temp.add(e*2);
            }
            for(Integer e:ans){
                if((e*2)-1 <= n) temp.add((e*2)-1);
            }
            ans = temp;
        }
        return ans;
    }
    //Divide and Conquer approach
    public static ArrayList<Integer> beautyArr(int n){
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }
    public static void divideConquer(int start, int increment, ArrayList<Integer> res, int n){
        //System.out.println("CALL -> start = " + start + ", increment = " + increment);
        if(start + increment > n){
            //System.out.println("Base Case -> Adding " + start);
            res.add(start);
            return;
        }
        divideConquer(start, 2*increment, res, n);
        divideConquer(start+increment, 2*increment, res, n);
    }
    public static void main(String[] args) {
        System.out.println(beautyArr(5));
    }    
}
