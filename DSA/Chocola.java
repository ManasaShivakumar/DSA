
import java.util.*;

public class Chocola {
    public static void main(String[] args){
        int n=4, m=6;
        Integer vercost[] ={2, 1, 3, 1, 4};//m-1
        Integer horcost[] ={4, 1, 2};//n-1

        Arrays.sort(vercost, Collections.reverseOrder());
        Arrays.sort(horcost, Collections.reverseOrder());

        int h=0, v=0;
        int hp=1, vp=1;
        int cost = 0;
        while(h<horcost.length && v<vercost.length){
            if(horcost[h] <= vercost[v]){//vertical cuts
                cost += (vercost[v]*hp);
                vp++;
                v++;
            }
            else{//horizontal cuts (vercost[v] < horcost[h])
                cost += (horcost[h]*vp);
                hp++;
                h++;
            }
        } 
        while(h<horcost.length){
            cost += (vp*horcost[h]);
            hp++;
            h++;
        }
        while(v<vercost.length){
            cost += (hp*vercost[v]);
            vp++;
            v++;
        }

        System.out.println("Mini cost to cut into pieces = "+cost);
    }
    
}
