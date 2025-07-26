import java.util.Scanner;
public class voteEligible {
      public static int eligibility(int num){
    if(num>=18){
        System.out.println("Eligible To Vote");
    }
    else{
        System.out.println("Not Eligible To Vote");
    }
    return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        eligibility(age);
        sc.close();
       
    }
}
