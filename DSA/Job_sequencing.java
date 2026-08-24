import java.util.*;

public class Job_sequencing {
    static class Job{
        int deadLine;
        int profit;
        char id;
        public Job(int dl, int p, char id){
            deadLine = dl;
            profit = p;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};
        ArrayList<Job> jobs = new ArrayList<>();   
        char ch = 'A';     
        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], ch));
            ch++;
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);
        ArrayList<Character> ans = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadLine > time){
                ans.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs = "+ans.size());
        System.out.println(ans);
    }    
}
