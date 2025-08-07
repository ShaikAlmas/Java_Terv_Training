//we will go for shopping , with total amount , we buy for some amount . Here we need to find the amount left with us with minimum denomination of notes.
//i.e if we have 1000 and we buy for 300 , then we need to find the minimum denomination of notes that can be used to pay the remaining amount i.e 700.
//Means we need to find the rupee notes given for the remaining amount in minimum denomination.
//We will use greedy approach to solve this problem.
import java.util.*;
public class minimumDenomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int pv= sc.nextInt();
        int r=t-pv;
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--){
            while(r>=a[i]){
             System.out.print(a[i]+" ");
                r-= a[i];      
            }
            if(r==0) break;
        }
        sc.close();
    }
}