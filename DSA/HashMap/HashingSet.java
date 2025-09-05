import java.util.*;

public class HashingSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<> ();
        set.add(1);
        set.add(2);
        set.add(3);
        if(set.contains(2)) System.out.println("Exist");
        if(!set.contains(5)) System.out.println("Not Exist");
        set.remove(1);
        System.out.println(set);
        // if(!set.contains(1)) System.out.println("Not Exist");
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
    }
}