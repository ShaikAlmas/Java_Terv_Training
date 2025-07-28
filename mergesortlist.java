import java.util.*;
public class mergesortlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        while(true){
            int n=sc.nextInt();
            if(n==-1) break;
            list.add(n);
        }
        ArrayList<Integer>list2=new ArrayList<>();
        while(true){
            int m=sc.nextInt();
            if(m==-1) break;
            list2.add(m);
        }
        list.addAll(list2);
        Collections.sort(list);
        System.out.print(list);
        sc.close();
    }
}
