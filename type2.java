public class type2 {
    public static void main(String[] args) {
        int n=5;
        int s=1;
        int binary=1;
        while(binary<=n){
           binary=binary*2; // binary<<=1;
        }
        binary = binary/2; //binary>>=1;
        int d=((2*(n-binary)+s)%n);
        System.out.println((d==0)?n:d);
    }
}
