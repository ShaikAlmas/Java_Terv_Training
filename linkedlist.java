import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<Integer>();
        list.add(1);
        list.addFirst(2);
        list.addLast(3);
        System.out.println(list);
        Iterator i=list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
