public class fivemul {
    public static void main(String[] args) {
        int n,last,firstTwo;
        n=125;
        last=n%10;
        firstTwo=n/100;
        int lastDig=(last*last);
        int firstDig=firstTwo*(firstTwo+1);
System.out.println(""+firstDig+lastDig);
    }
}
