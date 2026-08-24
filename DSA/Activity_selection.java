import java.util.*;

public class Activity_selection {
    public static void main(String[] args){
        int start[] = {1,0,5,2,5};
        int end[] = {9,2,6,4,7};
        ArrayList<Integer> ans = new ArrayList<>();
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        
        int maxact = 1; //by default selecting 1st activity
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<activities.length; i++){
            if(activities[i][1] >= lastEnd){
                maxact++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities = "+maxact);
        // System.out.println(ans);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }    
}
