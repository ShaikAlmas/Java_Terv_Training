import java.util.*;
public class evenlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        while(true){
            int num=sc.nextInt();
            if(num==-1) break;
            list.add(num);
        }
        for(int n:list){
            if((n&1)!=0){
                System.out.print(n+" ");
            }
        }
        sc.close();
    }
}
