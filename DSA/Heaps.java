import java.util.ArrayList;

public class Heaps {
    static class Heeap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){//O(logn)
            arr.add(data);//O(1)

            int c = arr.size()-1;
            int p = (c-1)/2;
            while(arr.get(c) < arr.get(p)){ //O(logn)
                int temp = arr.get(c);
                arr.set(c, arr.get(p));
                arr.set(p, temp);
                c = p;
                p = (c-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int min = i;
            if(left < arr.size() && arr.get(min) > arr.get(left)){
                min = left;
            }
            if(right < arr.size() && arr.get(min) > arr.get(right)){
                min = right;
            }

            if(min != i){
                //swap
                int temp = arr.get(min);
                arr.set(min, arr.get(i));
                arr.set(i, temp);

                heapify(min);
            }
        }
        public int remove(){
            int data = arr.get(0);
            //swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            //delete last
            arr.remove(arr.size()-1);
            //fix heap
            heapify(0);
            return data;
            
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args){
        Heeap h = new Heeap();
        h.add(5);
        h.add(4);
        h.add(9);
        h.add(3);
        h.add(1);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();            
        }
    }
}
