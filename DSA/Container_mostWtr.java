import java.util.ArrayList;
public class Container_mostWtr {
    //Brute Force O(n^2);
    public static int mostWater(ArrayList<Integer> height){
        int maxWtr = 0;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWtr = ht * width;
                maxWtr = Math.max(maxWtr, currWtr);
            }
        }
        return maxWtr;
    }

    //2 Pointer Approach O(n)
    public static int containerWith_mostWtr(ArrayList<Integer> height){
        int Lp = 0;
        int Rp = height.size()-1;
        int maxWtr = 0;
        while(Lp < Rp){
            int ht = Math.min(height.get(Lp), height.get(Rp));
            int width = Rp - Lp;
            int currWtr = ht * width;
            maxWtr = Math.max(maxWtr, currWtr);
            if(height.get(Lp) < height.get(Rp)){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        return maxWtr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Maximumu water = " +containerWith_mostWtr(height));
    }    
}
