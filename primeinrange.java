import java.util.Scanner;
public class primeinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        for(int i=n1+1;i<=n2;i++){
            if(i<2) continue;
            boolean prime=true;
            int j=2;
            while(j*j<=i){
                if((i%j==0)) prime=false;
                break;

            }
            if(prime) System.out.print(i+" ");
        }
    }
}
