public class reverse {
    public static void main(String[] args) {
        int n=30;
        int rev=0;
    while(n>0){
        rev=rev*10+(n%10);
        n/=10;

    }
    int ans=0;
    ans=ans*100+(rev%100);
    rev/=100;
    
    }
}
