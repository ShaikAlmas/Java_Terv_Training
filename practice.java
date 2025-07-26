import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LinkedList<Integer>list=new LinkedList<>();
        while(true){
            int n=sc.nextInt();
            if(n==-1) break;
            list.add(n);
        }
        int num=sc.nextInt();
        System.out.println((list.contains(num))?"Yes its Present":"No its not Present");
        sc.close();
    }
}
