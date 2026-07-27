import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args){
        // ArrayList<Integer> list = new ArrayList<>();
        
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // list.add(2,6);
        // System.out.println(list);

        //System.out.println(list.get(2));

        // list.remove(2);
        // System.out.println(list);

        // list.set(2,8);
        // System.out.println(list);

        // System.out.println(list.contains(4));
        // System.out.println(list.contains(24));

        // System.out.println(list.size());
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");            
        // }

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainlist.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainlist.add(list2);
        System.out.println(mainlist);
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}
