public class twonomul {
    public static void main(String[] args) { 
        int n1,n2,n3,n4;
        n1=75;
        n2=85;
        n3=(100-n1);
        n4=(100-n2);
    if(n3<100&&n4<100){
        int diff=(100-(n3+n4));
        int num=(diff*100+(n3*n4));
        System.out.println(num);
    }
    else{
        System.out.println("Enter number near to 100");
    }
}
}
