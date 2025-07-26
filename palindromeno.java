import java.util.Scanner;
public class palindromeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0,temp=n;
        while(temp>0){
            int dig=temp%10;
            rev=(rev*10)+dig;
            temp/=10;
        }
        System.out.println((rev==n)?"Palindrome":"Not palindrome");
        sc.close();
    }
}
