import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<Integer>();
        alist.add(5);
        alist.add(6);
         alist.add(7);
          alist.add(8);
           alist.add(9);
           System.out.println(alist);
           System.out.println(alist.get(2));
           Iterator i=alist.iterator();
           while(i.hasNext()){
           System.out.println(i.next());
           }
           
    }
}
