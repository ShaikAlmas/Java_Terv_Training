import java.util.Scanner;
public class trainseater{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        n=n%8;
        scan.close();
      if(n==1){
        System.out.println("Lower");
      }
      else if(n==2){
        System.out.println("Middle");
      }
      else if(n==3){
        System.out.println("Upper");
      }
      else if(n==4){
        System.out.println("Lower");
      }
      else if(n==5){
        System.out.println("Middle");
      }
      else if(n==6){
        System.out.println("Upper");
      }
      else if(n==7){
        System.out.println("SideLower");
      }
      else if(n==8){
        System.out.println("SideUpper");
      }
}
}


