import java.util.Scanner;
public class factorialWithLoop {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    int ans=1;
    for(int i=1;i<=n;i++){
        ans=ans*i;
    }
    System.out.println(ans);
}
}
