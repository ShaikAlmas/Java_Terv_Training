import java.util.Scanner;
public class MethodCalc {
    public static int add(int a,int b){
        return a+b;
    }
     public static int sub(int a,int b){
        return a-b;
    }
     public static int mul(int a,int b){
        return a*b;
    }
     public static int div(int a,int b){
        return a/b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = sc.nextInt();
        System.out.println("Enter num2: ");
        int b=sc.nextInt();
        System.out.println("Addition: "+add(a,b));
        System.out.println("Subtraction: "+sub(a,b));
        System.out.println("Multiplication: "+mul(a,b));
        System.out.println("Division: "+div(a,b));
        sc.close();
    }
}
