import java.util.Scanner;
public class mulwithoutoperator {
    public static int mul(int a,int b){
        int result =0;
        for( ;b>0;b>>=1,a<<=1){
            if((b&1)==1){
                result+=a;
            }
        }
       return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
       System.out.println("Product is: " + mul(n1, n2));
       sc.close();
    }
    
}
