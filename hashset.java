import java.util.*;
public class hashset {
    public static void main(String[] args) {
      HashSet<Integer> ts = new HashSet<>();
        ts.add(3);
        ts.add(2);
        ts.add(7);
        ts.add(2);
        ts.add(1);
        System.out.println(ts);
        
        // Uncomment to see the iterator in action
        // Iterator it = ts.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains(2));
        
        ts.clear();
        System.out.println(ts.clone());
        
        // Uncomment to see the first and last elements
        // System.out.println(ts.first());
        // System.out.println(ts.last());
    }
}