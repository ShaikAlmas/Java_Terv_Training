public class fibonacciWithLoop{
    public static void main(String[] args) {
        int n=10;
        int n1=0,n2=1,n3=0;
        for(int i=1;i<=n;i++){
n3=n1+n2;
System.out.print(n2+" ");
n1=n2;
n2=n3;
        }
    }
}