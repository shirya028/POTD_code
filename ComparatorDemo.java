import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator<ArrayList<Integer>> cmp=new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> i,ArrayList<Integer> j) {
                if(i.get(06) > j.get(0))
                    return 1;
                return -1;
            }
        };
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> t1=new ArrayList<>();
        t1.add(3);
        t1.add(4);
        list.add(t1); 
        ArrayList<Integer> t2=new ArrayList<>();
        t2.add(1);
        t2.add(3);
        list.add(t2);
        ArrayList<Integer> t3=new ArrayList<>();
        t3.add(4);
        t3.add(5);
        list.add(t3);
        
        System.out.println(list);

        Collections.sort(list,cmp);

        System.out.println(list);
    }
}
