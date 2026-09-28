import java.util.PriorityQueue;
public class PriorityQ {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 12000));
        pq.add(new Student("B", 1000));
        pq.add(new Student("C", 11500));
        pq.add(new Student("D", 15000));
        pq.add(new Student("E", 500));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }    
}
