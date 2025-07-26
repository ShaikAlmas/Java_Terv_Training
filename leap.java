public class leap {
    public static void main(String[] args) {
        int start_year=2000;
        int year=2050;
       int lp=year-start_year;
        int leapyear;
        if((start_year%100==0)&&(start_year%4==0)){
            leapyear=(lp/4)+1;
        }
        else{
            leapyear=(lp/4);
        }
        int l_odd=leapyear*2;
        int non_leap=lp-leapyear;
        int total=l_odd+non_leap;
        int rem=(total%7);
        switch(rem){
                case 1:
            System.out.println("sunday");
                break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 0:
            System.out.println("saturday");

        }
        }
}
