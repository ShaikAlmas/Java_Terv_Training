import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,temp=n , d=(n+ "").length();
        while(temp>0){
            sum+=Math.pow(temp%10,d);
            temp/=10;
        }
        System.out.println((sum==n)?"Yes":"No");
        sc.close();
    }
}
