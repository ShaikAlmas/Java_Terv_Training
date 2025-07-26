import java.util.Scanner;
public class passwordChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();
        sc.close();
        System.out.print((day%9)==0?"":day%9);
        for(int q=day/9;q>0;q--)
            System.out.print(9);

        }
    }

