public class squares {
     public static void main(String[] args) {
        int num=11;
        int aSquare,twoAB,bSquare;
        int a=num/10;
        int b=num%10;
        aSquare=a*a;
        twoAB=2*a*b;
        bSquare=b*b;
        twoAB+=bSquare/10;
        bSquare=bSquare%10;
        aSquare+=twoAB/10;
        twoAB=twoAB%10;
        System.out.println(""+aSquare+twoAB+bSquare);
     }
}
