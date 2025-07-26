public class el {
    public static void main(String[] args) {
        int n=45;
        int a=n/10;
        int b=n%10;
        int c=a+b;
        if(c>9){
            a+=c/10;
            c=c%10;
        }
        System.out.println(""+a+c+b);
        

    }
}
