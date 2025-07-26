public class count {
    public static void main(String[] args) {
        int n=123;
        int count=0;
        int sum=0;
        int rev=0;
        while(n>0){
            count++;
            sum=sum+(n%10);
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        System.out.println("count is:"+count);
System.out.println("Sum is:"+sum);
System.out.println("Reverse is:"+rev);
    }
}
